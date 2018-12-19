package retrofittest.ezlife.com.retrofittest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("wId")
    @Expose
    private String wId;
    @SerializedName("wName")
    @Expose
    private String wName;
    @SerializedName("wBSSID")
    @Expose
    private String wBSSID;
    @SerializedName("wPass")
    @Expose
    private String wPass;
    @SerializedName("wLon")
    @Expose
    private String wLon;
    @SerializedName("wLat")
    @Expose
    private String wLat;

    public String getWId() {
        return wId;
    }

    public void setWId(String wId) {
        this.wId = wId;
    }

    public String getWName() {
        return wName;
    }

    public void setWName(String wName) {
        this.wName = wName;
    }

    public String getWBSSID() {
        return wBSSID;
    }

    public void setWBSSID(String wBSSID) {
        this.wBSSID = wBSSID;
    }

    public String getWPass() {
        return wPass;
    }

    public void setWPass(String wPass) {
        this.wPass = wPass;
    }

    public String getWLon() {
        return wLon;
    }

    public void setWLon(String wLon) {
        this.wLon = wLon;
    }

    public String getWLat() {
        return wLat;
    }

    public void setWLat(String wLat) {
        this.wLat = wLat;
    }

}
