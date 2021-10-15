package com.rafli.recyclerviewpolije;

import android.os.Parcel;
import android.os.Parcelable;

public class Polije implements Parcelable{
    private String Major;
    private String Prodi;
    private String director;
    private String Akreditasi;
    private String description;
    private String releasedate;

    public Polije(String major, String prodi, String director, String akreditasi, String description, String releasedate) {
        this.Major = major;
        this.Prodi = prodi;
        this.director = director;
        this.Akreditasi = akreditasi;
        this.description = description;
        this.releasedate = releasedate;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String prodi) {
        Prodi = prodi;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAkreditasi() {
        return Akreditasi;
    }

    public void setAkreditasi(String akreditasi) {
        Akreditasi = akreditasi;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Major);
        dest.writeString(this.Prodi);
        dest.writeString(this.director);
        dest.writeString(this.Akreditasi);
        dest.writeString(this.description);
        dest.writeString(this.releasedate);
    }

    public void readFromParcel(Parcel source) {
        this.Major = source.readString();
        this.Prodi = source.readString();
        this.director = source.readString();
        this.Akreditasi = source.readString();
        this.description = source.readString();
        this.releasedate = source.readString();
    }

    protected Polije(Parcel in) {
        this.Major = in.readString();
        this.Prodi = in.readString();
        this.director = in.readString();
        this.Akreditasi = in.readString();
        this.description = in.readString();
        this.releasedate = in.readString();
    }

    public static final Creator<Polije> CREATOR = new Creator<Polije>() {
        @Override
        public Polije createFromParcel(Parcel source) {
            return new Polije(source);
        }

        @Override
        public Polije[] newArray(int size) {
            return new Polije[size];
        }
    };
}

