package dharani_hibernate.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Column;

@Entity
public class song {
@Id
@Column(name="songid")
 private int songid;
@Column(name="songname")
 private String songname;
@Column(name="singer")
 private String singer;
public int getSongid() {
	return songid;
}
public void setSongid(int songid) {
	this.songid = songid;
}
public String getSongname() {
	return songname;
}
public void setSongname(String songname) {
	this.songname = songname;
}
public String getSinger() {
	return singer;
}
public void setSinger(String singer) {
	this.singer = singer;
}
@Override
public String toString() {
	return "song [songid=" + songid + ", songname=" + songname + ", singer=" + singer + "]";
}
 
}
