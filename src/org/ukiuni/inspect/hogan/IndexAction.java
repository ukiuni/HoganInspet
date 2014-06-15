package org.ukiuni.inspect.hogan;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.ukiuni.inspect.hogan.entity.Message;
import org.ukiuni.inspect.hogan.entity.User;

@Path("/")
public class IndexAction {

	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public User loadUser(@QueryParam("name") String userName) {
		User user = User.load(userName);
		return user;
	}

	@GET
	@Path("/messages")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> loadMessage(@QueryParam("userName") String userName) {
		List<Message> messages = Message.loadByUserName(userName);
		return messages;
	}
}
