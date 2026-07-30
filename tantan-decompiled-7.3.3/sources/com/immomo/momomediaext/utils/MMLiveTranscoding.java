package com.immomo.momomediaext.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.momomediaext.sei.BaseSei;
import com.immomo.momomediaext.sei.JsonHelper;
import com.tencent.connect.common.Constants;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MMLiveTranscoding implements Serializable {
    public int canvasColorB;
    public int canvasColorG;
    public int canvasColorR;
    public int canvasHeight;
    public int canvasWidth;
    public int ctyp;
    public String extString;
    public String inv;
    public String mid;
    public int styp;

    /* JADX INFO: renamed from: ts */
    public long f14649ts;
    public String userid;
    public int videoBitrate;
    public int videoFps = 15;
    public List<MMLiveLinkMember> confMembers = new LinkedList();
    public List<MMLiveLinkMember> infoMembers = new LinkedList();
    public List<MMLiveLinkMember> hasMembers = new LinkedList();
    public long infoInv = 0;
    public int shortSei = 0;

    public static class MMLiveHasMember implements Serializable {

        /* JADX INFO: renamed from: h */
        public float f14650h;
        public int muteFlag;
        public int offlineFlag;
        public String userid;
        public float volume = 0.0f;

        /* JADX INFO: renamed from: w */
        public float f14651w;

        /* JADX INFO: renamed from: x */
        public float f14652x;

        /* JADX INFO: renamed from: y */
        public float f14653y;

        /* JADX INFO: renamed from: z */
        public int f14654z;
    }

    public static class MMLiveLinkMember implements Serializable {

        /* JADX INFO: renamed from: h */
        public float f14655h;
        public boolean isMuteAudio;
        public int muteFlag;
        public int offlineFlag;
        public String userid;
        public float volume = 0.0f;

        /* JADX INFO: renamed from: w */
        public float f14656w;

        /* JADX INFO: renamed from: x */
        public float f14657x;

        /* JADX INFO: renamed from: y */
        public float f14658y;

        /* JADX INFO: renamed from: z */
        public int f14659z;
    }

    public MMLiveTranscoding(String str) throws Exception {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        this.inv = jSONObject.optString(BaseSei.INV);
        this.mid = jSONObject.optString(BaseSei.MID);
        this.extString = jSONObject.optString(BaseSei.EXT);
        this.f14649ts = jSONObject.optLong(Constants.f58037TS);
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("canvas");
        if (jSONObjectOptJSONObject2 != null) {
            this.canvasWidth = jSONObjectOptJSONObject2.optInt("w", 0);
            this.canvasHeight = jSONObjectOptJSONObject2.optInt("h", 0);
            if (jSONObjectOptJSONObject2.optJSONArray("bgrgb") != null) {
                this.canvasColorR = jSONObjectOptJSONObject2.optJSONArray("bgrgb").optInt(0);
                this.canvasColorG = jSONObjectOptJSONObject2.optJSONArray("bgrgb").optInt(1);
                this.canvasColorB = jSONObjectOptJSONObject2.optJSONArray("bgrgb").optInt(2);
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(BaseSei.CONF);
        if (jSONArrayOptJSONArray2 != null) {
            int i = 0;
            while (i < jSONArrayOptJSONArray2.length()) {
                MMLiveLinkMember mMLiveLinkMember = new MMLiveLinkMember();
                mMLiveLinkMember.volume = (float) jSONArrayOptJSONArray2.optJSONObject(i).optDouble(BaseSei.f14622VO);
                mMLiveLinkMember.muteFlag = jSONArrayOptJSONArray2.optJSONObject(i).optInt(BaseSei.f14620MU);
                mMLiveLinkMember.offlineFlag = jSONArrayOptJSONArray2.optJSONObject(i).optInt(BaseSei.f14621OL);
                mMLiveLinkMember.userid = jSONArrayOptJSONArray2.optJSONObject(i).optString("id");
                mMLiveLinkMember.f14656w = (float) jSONArrayOptJSONArray2.optJSONObject(i).optDouble("w");
                mMLiveLinkMember.f14655h = (float) jSONArrayOptJSONArray2.optJSONObject(i).optDouble("h");
                mMLiveLinkMember.f14657x = (float) jSONArrayOptJSONArray2.optJSONObject(i).optDouble(BaseSei.f14624X);
                mMLiveLinkMember.f14658y = (float) jSONArrayOptJSONArray2.optJSONObject(i).optDouble(BaseSei.f14625Y);
                mMLiveLinkMember.f14659z = jSONArrayOptJSONArray2.optJSONObject(i).optInt(BaseSei.f14626Z);
                this.confMembers.add(mMLiveLinkMember);
                i++;
                jSONObject = jSONObject;
            }
        }
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2.optJSONObject(BaseSei.INFO) != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject(BaseSei.INFO)) != null) {
            this.ctyp = jSONObjectOptJSONObject.optInt(BaseSei.CTYPE);
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("cuids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray3.length(); i2++) {
                    MMLiveLinkMember mMLiveLinkMember2 = new MMLiveLinkMember();
                    mMLiveLinkMember2.volume = (float) jSONArrayOptJSONArray3.optJSONObject(i2).optDouble(BaseSei.f14622VO);
                    mMLiveLinkMember2.muteFlag = jSONArrayOptJSONArray3.optJSONObject(i2).optInt(BaseSei.f14620MU);
                    mMLiveLinkMember2.offlineFlag = jSONArrayOptJSONArray3.optJSONObject(i2).optInt(BaseSei.f14621OL);
                    mMLiveLinkMember2.userid = jSONArrayOptJSONArray3.optJSONObject(i2).optString("id");
                    mMLiveLinkMember2.f14656w = (float) jSONArrayOptJSONArray3.optJSONObject(i2).optDouble("w");
                    mMLiveLinkMember2.f14655h = (float) jSONArrayOptJSONArray3.optJSONObject(i2).optDouble("h");
                    mMLiveLinkMember2.f14657x = (float) jSONArrayOptJSONArray3.optJSONObject(i2).optDouble(BaseSei.f14624X);
                    mMLiveLinkMember2.f14658y = (float) jSONArrayOptJSONArray3.optJSONObject(i2).optDouble(BaseSei.f14625Y);
                    mMLiveLinkMember2.f14659z = jSONArrayOptJSONArray3.optJSONObject(i2).optInt(BaseSei.f14626Z);
                    this.infoMembers.add(mMLiveLinkMember2);
                }
            }
        }
        if (jSONObject2.optJSONArray("has") == null || (jSONArrayOptJSONArray = jSONObject2.optJSONArray("has")) == null) {
            return;
        }
        for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
            MMLiveLinkMember mMLiveLinkMember3 = new MMLiveLinkMember();
            mMLiveLinkMember3.volume = (float) jSONArrayOptJSONArray.optJSONObject(i3).optDouble(BaseSei.f14622VO);
            mMLiveLinkMember3.muteFlag = jSONArrayOptJSONArray.optJSONObject(i3).optInt(BaseSei.f14620MU);
            mMLiveLinkMember3.offlineFlag = jSONArrayOptJSONArray.optJSONObject(i3).optInt(BaseSei.f14621OL);
            mMLiveLinkMember3.userid = jSONArrayOptJSONArray.optJSONObject(i3).optString("id");
            mMLiveLinkMember3.f14656w = (float) jSONArrayOptJSONArray.optJSONObject(i3).optDouble("w");
            mMLiveLinkMember3.f14655h = (float) jSONArrayOptJSONArray.optJSONObject(i3).optDouble("h");
            mMLiveLinkMember3.f14657x = (float) jSONArrayOptJSONArray.optJSONObject(i3).optDouble(BaseSei.f14624X);
            mMLiveLinkMember3.f14658y = (float) jSONArrayOptJSONArray.optJSONObject(i3).optDouble(BaseSei.f14625Y);
            mMLiveLinkMember3.f14659z = jSONArrayOptJSONArray.optJSONObject(i3).optInt(BaseSei.f14626Z);
            this.hasMembers.add(mMLiveLinkMember3);
        }
    }

    @NonNull
    public String toString() {
        BaseSei baseSei = new BaseSei();
        baseSei.setInv(this.inv);
        baseSei.setMid(this.mid);
        baseSei.setShortSei(this.shortSei);
        baseSei.getInfo().setCtyp(this.ctyp);
        baseSei.getInfo().setStyp(this.styp);
        baseSei.setCtyp(String.valueOf(this.ctyp));
        baseSei.setStyp(String.valueOf(this.styp));
        if (this.infoInv != 0) {
            baseSei.getInfo().setInv(this.infoInv);
        }
        BaseSei.CanvasBean canvas = baseSei.getCanvas();
        canvas.setW(this.canvasWidth);
        canvas.setH(this.canvasHeight);
        LinkedList linkedList = new LinkedList();
        linkedList.add(Integer.valueOf(this.canvasColorR));
        linkedList.add(Integer.valueOf(this.canvasColorG));
        linkedList.add(Integer.valueOf(this.canvasColorB));
        canvas.setBgrgb(linkedList);
        baseSei.setExt(this.extString);
        for (int i = 0; i < this.confMembers.size(); i++) {
            BaseSei.SeiBean seiBean = new BaseSei.SeiBean();
            MMLiveLinkMember mMLiveLinkMember = this.confMembers.get(i);
            seiBean.setId(mMLiveLinkMember.userid);
            seiBean.setX(mMLiveLinkMember.f14657x);
            seiBean.setY(mMLiveLinkMember.f14658y);
            seiBean.setW(mMLiveLinkMember.f14656w);
            seiBean.setH(mMLiveLinkMember.f14655h);
            seiBean.setZ(mMLiveLinkMember.f14659z);
            seiBean.setMu(mMLiveLinkMember.muteFlag);
            seiBean.setVo(mMLiveLinkMember.volume);
            seiBean.setOl(mMLiveLinkMember.offlineFlag);
            seiBean.setPkmu(mMLiveLinkMember.isMuteAudio ? 2 : 0);
            baseSei.getConf().add(seiBean);
        }
        for (int i2 = 0; i2 < this.infoMembers.size(); i2++) {
            BaseSei.SeiBean seiBean2 = new BaseSei.SeiBean();
            MMLiveLinkMember mMLiveLinkMember2 = this.infoMembers.get(i2);
            seiBean2.setId(mMLiveLinkMember2.userid);
            seiBean2.setX(mMLiveLinkMember2.f14657x);
            seiBean2.setY(mMLiveLinkMember2.f14658y);
            seiBean2.setW(mMLiveLinkMember2.f14656w);
            seiBean2.setH(mMLiveLinkMember2.f14655h);
            seiBean2.setZ(mMLiveLinkMember2.f14659z);
            seiBean2.setMu(mMLiveLinkMember2.muteFlag);
            seiBean2.setVo(mMLiveLinkMember2.volume);
            seiBean2.setOl(mMLiveLinkMember2.offlineFlag);
            baseSei.getInfo().getCuids().add(seiBean2);
        }
        for (int i3 = 0; i3 < this.hasMembers.size(); i3++) {
            BaseSei.SeiBean seiBean3 = new BaseSei.SeiBean();
            MMLiveLinkMember mMLiveLinkMember3 = this.hasMembers.get(i3);
            seiBean3.setId(mMLiveLinkMember3.userid);
            seiBean3.setX(mMLiveLinkMember3.f14657x);
            seiBean3.setY(mMLiveLinkMember3.f14658y);
            seiBean3.setW(mMLiveLinkMember3.f14656w);
            seiBean3.setH(mMLiveLinkMember3.f14655h);
            seiBean3.setZ(mMLiveLinkMember3.f14659z);
            seiBean3.setMu(mMLiveLinkMember3.muteFlag);
            seiBean3.setVo(mMLiveLinkMember3.volume);
            seiBean3.setOl(mMLiveLinkMember3.offlineFlag);
            baseSei.getHas().add(seiBean3);
        }
        return JsonHelper.toJsonString(baseSei);
    }

    public String toString2() {
        return "<uid:" + this.userid + ",r:" + this.canvasColorR + ",g:" + this.canvasColorG + ",b:" + this.canvasColorB + ",cw:" + this.canvasWidth + ",ch:" + this.canvasHeight + ",vb:" + this.videoBitrate + ",cb:" + this.confMembers.size() + ",in:" + this.infoMembers.size() + ",inv:" + this.inv + "',mid:" + this.mid + "',cty:" + this.ctyp + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA + this.extString + "',ts:" + this.f14649ts + ",videoFps:" + this.videoFps + '>';
    }

    public MMLiveTranscoding() {
    }
}
