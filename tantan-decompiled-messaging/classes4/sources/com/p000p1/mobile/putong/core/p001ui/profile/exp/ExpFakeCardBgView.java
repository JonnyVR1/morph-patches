package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.NewProfileCompletionConfig;
import java.util.List;
import l.e3c0;
import l.f6c0;
import l.j760;
import l.lqa;
import l.u4c0;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpFakeCardBgView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f977a;

    /* JADX INFO: renamed from: b */
    public VText f978b;

    /* JADX INFO: renamed from: c */
    public VText f979c;

    public ExpFakeCardBgView(Context context) {
        super(context);
        m1398b();
    }

    /* JADX INFO: renamed from: b */
    public void m1398b() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.F2, (ViewGroup) null);
        this.f977a = viewInflate.findViewById(u4c0.de);
        this.f978b = viewInflate.findViewById(u4c0.fe);
        this.f979c = viewInflate.findViewById(u4c0.ee);
        addView(viewInflate, xdl0.e, xdl0.f);
    }

    /* JADX INFO: renamed from: c */
    public void m1399c(int i, boolean z, boolean z2) {
        if (i >= 0 && i < getCardBgList().size()) {
            if (z2) {
                String str = (String) getCardBgList().get(i).a;
                this.f978b.setText(str);
                xdl0.M(this.f978b, true);
                if (lqa.q() && TextUtils.isEmpty(str)) {
                    xdl0.M(this.f978b, false);
                }
            } else {
                xdl0.M(this.f978b, false);
            }
            this.f977a.setBackgroundResource(((Integer) getCardBgList().get(i).b).intValue());
        }
        xdl0.M(this.f979c, false);
        this.f979c.setText("");
        if (lqa.q() && ((String) CoreModule.c.e0.Z3.get()).equals("marryMode")) {
            z = false;
        }
        if (!z) {
            xdl0.M(this.f979c, false);
            return;
        }
        if (lqa.w()) {
            NewProfileCompletionConfig newProfileCompletionConfigS = lqa.s();
            if (i >= newProfileCompletionConfigS.weight.picture.size() || ((Integer) newProfileCompletionConfigS.weight.picture.get(i)).intValue() <= 0) {
                return;
            }
            xdl0.M0(this.f979c, true);
            this.f979c.setText("+" + newProfileCompletionConfigS.weight.picture.get(i) + "%");
        }
    }

    public List<j760<String, Integer>> getCardBgList() {
        return vwb.Q(vwb.f0(new String[]{"真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"}), new w9j() { // from class: l.wdf
            public final Object call(Object obj) {
                return j760.a((String) obj, Integer.valueOf(e3c0.w));
            }
        });
    }
}
