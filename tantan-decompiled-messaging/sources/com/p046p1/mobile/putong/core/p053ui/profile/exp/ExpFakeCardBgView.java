package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NewProfileCompletionConfig;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import java.util.List;
import org.slf4j.Marker;
import p147v.VImage;
import p147v.VText;
import p149l.f6c0;
import p149l.j760;
import p149l.lqa;
import p149l.u4c0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpFakeCardBgView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f33155a;

    /* JADX INFO: renamed from: b */
    public VText f33156b;

    /* JADX INFO: renamed from: c */
    public VText f33157c;

    public ExpFakeCardBgView(Context context) {
        super(context);
        m50950b();
    }

    /* JADX INFO: renamed from: b */
    public void m50950b() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f95349F2, (ViewGroup) null);
        this.f33155a = (VImage) viewInflate.findViewById(u4c0.f174217de);
        this.f33156b = (VText) viewInflate.findViewById(u4c0.f174251fe);
        this.f33157c = (VText) viewInflate.findViewById(u4c0.f174234ee);
        addView(viewInflate, xdl0.f192403e, xdl0.f192404f);
    }

    /* JADX INFO: renamed from: c */
    public void m50951c(int i, boolean z, boolean z2) {
        if (i >= 0 && i < getCardBgList().size()) {
            if (z2) {
                String str = getCardBgList().get(i).f116564a;
                this.f33156b.setText(str);
                xdl0.m208344M(this.f33156b, true);
                if (lqa.m150979q() && TextUtils.isEmpty(str)) {
                    xdl0.m208344M(this.f33156b, false);
                }
            } else {
                xdl0.m208344M(this.f33156b, false);
            }
            this.f33155a.setBackgroundResource(getCardBgList().get(i).f116565b.intValue());
        }
        xdl0.m208344M(this.f33157c, false);
        this.f33157c.setText("");
        if (lqa.m150979q() && CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode)) {
            z = false;
        }
        if (!z) {
            xdl0.m208344M(this.f33157c, false);
            return;
        }
        if (lqa.m150985w()) {
            NewProfileCompletionConfig newProfileCompletionConfigM150981s = lqa.m150981s();
            if (i >= newProfileCompletionConfigM150981s.weight.picture.size() || newProfileCompletionConfigM150981s.weight.picture.get(i).intValue() <= 0) {
                return;
            }
            xdl0.m208345M0(this.f33157c, true);
            this.f33157c.setText(Marker.ANY_NON_NULL_MARKER + newProfileCompletionConfigM150981s.weight.picture.get(i) + "%");
        }
    }

    public List<j760<String, Integer>> getCardBgList() {
        return vwb.m200303Q(vwb.m200324f0("真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"), new w9j() { // from class: l.wdf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j760.m140076a((String) obj, Integer.valueOf(e3c0.f89156w));
            }
        });
    }
}
