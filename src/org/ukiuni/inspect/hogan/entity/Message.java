package org.ukiuni.inspect.hogan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Message {
	private String text;
	private Date createdAt;

	public static List<Message> loadByUserName(String userName) {
		List<Message> messages = new ArrayList<Message>();
		{
			Message message = new Message();
			message.setText("message text 1");
			message.setCreatedAt(new Date());
			messages.add(message);
		}
		{
			Message message = new Message();
			message.setText("message text 2");
			message.setCreatedAt(new Date());
			messages.add(message);
		}
		{
			Message message = new Message();
			message.setText("message text 3");
			message.setCreatedAt(new Date());
			messages.add(message);
		}
		return messages;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
