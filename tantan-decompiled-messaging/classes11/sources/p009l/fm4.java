package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.core.data.ExpandedSwipeSvgaConfig;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fm4 {

    /* JADX INFO: renamed from: a */
    public static ExpandedSwipeSvgaConfig f13084a;

    /* JADX INFO: renamed from: a */
    public static void m14503a() {
        if (f13084a == null) {
            if (!TextUtils.isEmpty(RemoteConfig.m9619x().m9623F("expanded_card_svga_config"))) {
                try {
                    f13084a = (ExpandedSwipeSvgaConfig) RemoteConfig.m9619x().m9654v("expanded_card_svga_config", ExpandedSwipeSvgaConfig.JSON_ADAPTER);
                } catch (Exception unused) {
                }
            }
            f13084a = null;
        }
        if (f13084a == null) {
            f13084a = ExpandedSwipeSvgaConfig.new_();
            if (upa.z()) {
                ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig = f13084a;
                expandedSwipeSvgaConfig.card_like = "https://auto.tancdn.com/v1/raw/af9a963e-6627-4d56-b884-66aba6f83b7214.svga";
                expandedSwipeSvgaConfig.card_dislike = "https://auto.tancdn.com/v1/raw/e9b73488-6b63-430b-a6e4-4c45d14d39ba14.svga";
                expandedSwipeSvgaConfig.card_btn_like = "https://auto.tancdn.com/v1/raw/c1aa89e4-a595-4627-893f-6099b8d296c114.svga";
                expandedSwipeSvgaConfig.card_btn_dislike = "https://auto.tancdn.com/v1/raw/eeb7b22a-053a-4abb-a0d8-fa599bc2d09e14.svga";
                expandedSwipeSvgaConfig.card_btn_click_like = "https://auto.tancdn.com/v1/raw/c1aa89e4-a595-4627-893f-6099b8d296c114.svga";
                expandedSwipeSvgaConfig.card_btn_click_dislike = "https://auto.tancdn.com/v1/raw/eeb7b22a-053a-4abb-a0d8-fa599bc2d09e14.svga";
                expandedSwipeSvgaConfig.card_btn_click_superlike = "https://auto.tancdn.com/v1/raw/07c25711-48f6-4ab0-8099-533c0534921b14.svga";
                return;
            }
            ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig2 = f13084a;
            expandedSwipeSvgaConfig2.card_like = "https://auto.tancdn.com/v1/raw/1ebe3c00-b777-4c2f-a915-a9da2727835e14.svga";
            expandedSwipeSvgaConfig2.card_dislike = "https://auto.tancdn.com/v1/raw/a2fe522c-fa3b-4d53-b3dd-cf87daf2c74014.svga";
            expandedSwipeSvgaConfig2.card_btn_like = "https://auto.tancdn.com/v1/raw/e5b42292-42ac-4538-beae-d36298e9a6b014.svga";
            expandedSwipeSvgaConfig2.card_btn_dislike = "https://auto.tancdn.com/v1/raw/1fa8c2f5-a5df-4f90-a812-54b56f71beed14.svga";
            expandedSwipeSvgaConfig2.card_btn_click_like = "https://auto.tancdn.com/v1/raw/e2901675-83fd-4bf2-9442-2ed962337a7e14.svga";
            expandedSwipeSvgaConfig2.card_btn_click_dislike = "https://auto.tancdn.com/v1/raw/99bc71ba-ef57-4b04-a05a-fd34a1175aa814.svga";
            expandedSwipeSvgaConfig2.card_btn_click_superlike = "https://fe-static.tancdn.com/v1/raw/02f81d7a-799d-4e83-a6b5-9e036be1310914.svga";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m14504b() {
        m14503a();
        return f13084a.card_btn_click_dislike;
    }

    /* JADX INFO: renamed from: c */
    public static String m14505c() {
        m14503a();
        return f13084a.card_btn_click_like;
    }

    /* JADX INFO: renamed from: d */
    public static String m14506d() {
        m14503a();
        return f13084a.card_btn_click_superlike;
    }

    /* JADX INFO: renamed from: e */
    public static String m14507e() {
        m14503a();
        return f13084a.card_btn_dislike;
    }

    /* JADX INFO: renamed from: f */
    public static String m14508f() {
        m14503a();
        return f13084a.card_btn_like;
    }

    /* JADX INFO: renamed from: g */
    public static String m14509g() {
        m14503a();
        return f13084a.card_dislike;
    }

    /* JADX INFO: renamed from: h */
    public static String m14510h() {
        m14503a();
        return f13084a.card_like;
    }

    /* JADX INFO: renamed from: i */
    public static void m14511i() {
        f13084a = null;
    }
}
