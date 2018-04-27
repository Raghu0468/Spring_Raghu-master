package com.xvitcoder.springmvcangularjs.response;

import java.util.List;

public class GalleryPojo {

	String thumb;
	String image;
	List<Tags> tags;
	

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


}
