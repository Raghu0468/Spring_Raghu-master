package com.xvitcoder.springmvcangularjs.response;

import java.util.List;

public class GalleryPojo {

	/*
	 * { "thumb": "images/gallery/thumb-1.jpg", "image":
	 * "images/gallery/image-1.jpg", "tags": [ {"type": "info", "name":
	 * "breakfast"}, {"type": "danger", "name": "fruits"}, {"type": "success",
	 * "name": "toast"}, {"type": "warning arrowed-in", "name": "diet"} ], "tools":
	 * "default" }
	 */

	String thumb;
	String image;
	List<Tags> tags;
	String name;
	String type;
	String tools;
	String caption;

	public List<Tags> getTags() {
		return tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.tools = caption;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
