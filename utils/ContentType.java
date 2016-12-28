
 /*
 * Author: Vijayendra Tripathi
 *
 * Copyright (c) 2016 Vijayendra Tripathi.
 * All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */


public class ContentType {
	
	/*
	 * For list of MIME type.
	 * Refer:
	 * http://webdesign.about.com/od/multimedia/a/mime-types-by-content-type.htm
	 * http://en.wikipedia.org/wiki/Internet_media_type
	 */
	public static boolean isMIMETextType(String contentType) {
		if(contentType.equals("application/xhtml+xml")
				|| contentType.equals("text/plain")
				|| contentType.equals("text/html")
				|| contentType.equals("htm")
				|| contentType.equals("html")
				|| contentType.equals("xml")
				|| contentType.equals("application/xml")
				|| contentType.equals("application/xhtml")
				|| contentType.equals("application/atom+xml")
				|| contentType.equals("text")
				|| contentType.equals("xhtml")
				|| contentType.equals("html")) {
			return true;
		}
		Sys.Log("Ignorable Content Type: " + contentType);
		return false;
	}
	
	public static boolean isMIMEImageType(String contentType) {
		if(contentType.equals("image/jpeg")
				|| contentType.equals("image/jpg")
				|| contentType.equals("image/png")
				|| contentType.equals("image/gif")
				|| contentType.equals("image/tiff")
				|| contentType.equals("image/bmp")) {
			return true;
		}
		return false;
	}
	
	 public static boolean isMIMEAudioType(String contentType) {
		 if(contentType.equals("audio/midi")
					|| contentType.equals("audio/basic")
					|| contentType.equals("audio/L24")
					|| contentType.equals("audio/mp4")
					|| contentType.equals("audio/mpeg")
					|| contentType.equals("audio/ogg")) {
				return true;
		}
		return false;
	 }
	 
	 public static boolean isMIMEVideoType(String contentType) {
		if(contentType.equals("video/mpeg")
					|| contentType.equals("video/mp4")
					|| contentType.equals("video/ogg")
					|| contentType.equals("video/quicktime")
					|| contentType.equals("video/x-flv")
					|| contentType.equals("video/webm")) {
				return true;
		}
		return false;
	 }
	 
	 // ONLY FEW WELL KNOWN TYPES SUPPORTED. MORE TO COME ...
	 public static String getContentType(String _path) {
		 if(_path == null) return null;
		 String path = _path.toLowerCase();
		 if(path.endsWith(".jpeg")) {
			 return "image/jpeg";
		 }
		 else if(path.endsWith(".jpg")) {
			 return "image/jpg";
		 }
		 else if(path.endsWith(".png")) {
			 return "image/png";
		 }
		 else if(path.endsWith(".gif")) {
			 return "image/gif";
		 }
		 else if(path.endsWith(".tiff")) {
			 return "image/tiff";
		 }
		 else if(path.endsWith(".bmp")) {
			 return "image/bmp";
		 }
		 else if(path.endsWith(".html")) {
			 return "text/html";
		 }
		 else if(path.endsWith(".xml")) {
			 return "text/xml";
		 }
		 else if(path.endsWith(".mp4")) {
			 return "audio/mp4";
		 }
		 else if(path.endsWith(".midi")) {
			 return "audio/midi";
		 }
		 else if(path.endsWith(".ogg")) {
			 return "video/ogg";
		 }
		 else if(path.endsWith(".mpeg")) {
			 return "audio/mpeg";
		 }
		 else if(path.endsWith(".mpeg")) {
			 return "video/mpeg";
		 }
		 else if(path.endsWith(".mp4")) {
			 return "video/mp4";	 
		 }
		 return null;
	 }

}

