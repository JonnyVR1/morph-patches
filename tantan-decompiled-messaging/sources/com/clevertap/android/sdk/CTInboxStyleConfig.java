package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.codec.language.p122bm.Rule;

/* JADX INFO: loaded from: classes.dex */
public class CTInboxStyleConfig implements Parcelable {
    public static final Parcelable.Creator<CTInboxStyleConfig> CREATOR = new C1163a();
    private static final int MAX_TABS = 2;
    private String backButtonColor;
    private String firstTabTitle;
    private String inboxBackgroundColor;
    private String navBarColor;
    private String navBarTitle;
    private String navBarTitleColor;
    private String noMessageViewText;
    private String noMessageViewTextColor;
    private String selectedTabColor;
    private String selectedTabIndicatorColor;
    private String tabBackgroundColor;
    private String[] tabs;
    private String unselectedTabColor;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.CTInboxStyleConfig$a */
    public class C1163a implements Parcelable.Creator<CTInboxStyleConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CTInboxStyleConfig createFromParcel(Parcel parcel) {
            return new CTInboxStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CTInboxStyleConfig[] newArray(int i) {
            return new CTInboxStyleConfig[i];
        }
    }

    public CTInboxStyleConfig(Parcel parcel) {
        this.navBarColor = parcel.readString();
        this.navBarTitle = parcel.readString();
        this.navBarTitleColor = parcel.readString();
        this.inboxBackgroundColor = parcel.readString();
        this.tabs = parcel.createStringArray();
        this.backButtonColor = parcel.readString();
        this.selectedTabColor = parcel.readString();
        this.unselectedTabColor = parcel.readString();
        this.selectedTabIndicatorColor = parcel.readString();
        this.tabBackgroundColor = parcel.readString();
        this.noMessageViewText = parcel.readString();
        this.noMessageViewTextColor = parcel.readString();
        this.firstTabTitle = parcel.readString();
    }

    /* JADX INFO: renamed from: a */
    public String m5730a() {
        return this.backButtonColor;
    }

    /* JADX INFO: renamed from: b */
    public String m5731b() {
        return this.firstTabTitle;
    }

    /* JADX INFO: renamed from: c */
    public String m5732c() {
        return this.inboxBackgroundColor;
    }

    /* JADX INFO: renamed from: d */
    public String m5733d() {
        return this.navBarColor;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public String m5734e() {
        return this.navBarTitle;
    }

    /* JADX INFO: renamed from: f */
    public String m5735f() {
        return this.navBarTitleColor;
    }

    /* JADX INFO: renamed from: g */
    public String m5736g() {
        return this.noMessageViewText;
    }

    /* JADX INFO: renamed from: h */
    public String m5737h() {
        return this.noMessageViewTextColor;
    }

    /* JADX INFO: renamed from: i */
    public String m5738i() {
        return this.selectedTabColor;
    }

    /* JADX INFO: renamed from: k */
    public String m5739k() {
        return this.selectedTabIndicatorColor;
    }

    /* JADX INFO: renamed from: l */
    public String m5740l() {
        return this.tabBackgroundColor;
    }

    /* JADX INFO: renamed from: m */
    public ArrayList<String> m5741m() {
        return this.tabs == null ? new ArrayList<>() : new ArrayList<>(Arrays.asList(this.tabs));
    }

    /* JADX INFO: renamed from: n */
    public String m5742n() {
        return this.unselectedTabColor;
    }

    /* JADX INFO: renamed from: o */
    public boolean m5743o() {
        String[] strArr = this.tabs;
        return strArr != null && strArr.length > 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.navBarColor);
        parcel.writeString(this.navBarTitle);
        parcel.writeString(this.navBarTitleColor);
        parcel.writeString(this.inboxBackgroundColor);
        parcel.writeStringArray(this.tabs);
        parcel.writeString(this.backButtonColor);
        parcel.writeString(this.selectedTabColor);
        parcel.writeString(this.unselectedTabColor);
        parcel.writeString(this.selectedTabIndicatorColor);
        parcel.writeString(this.tabBackgroundColor);
        parcel.writeString(this.noMessageViewText);
        parcel.writeString(this.noMessageViewTextColor);
        parcel.writeString(this.firstTabTitle);
    }

    public CTInboxStyleConfig() {
        this.navBarColor = "#FFFFFF";
        this.navBarTitle = "App Inbox";
        this.navBarTitleColor = "#333333";
        this.inboxBackgroundColor = "#D3D4DA";
        this.backButtonColor = "#333333";
        this.selectedTabColor = "#1C84FE";
        this.unselectedTabColor = "#808080";
        this.selectedTabIndicatorColor = "#1C84FE";
        this.tabBackgroundColor = "#FFFFFF";
        this.tabs = new String[0];
        this.noMessageViewText = "No Message(s) to show";
        this.noMessageViewTextColor = Constants.BLACK;
        this.firstTabTitle = Rule.ALL;
    }
}
