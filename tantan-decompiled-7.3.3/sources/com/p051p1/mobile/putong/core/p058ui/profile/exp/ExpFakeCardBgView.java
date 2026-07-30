package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NewProfileCompletionConfig;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import java.util.List;
import org.slf4j.Marker;
import p151v.VImage;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.jyb;
import p153l.kec0;
import p153l.pf60;
import p153l.qcj;
import p153l.xra;

/* JADX INFO: loaded from: classes4.dex */
public class ExpFakeCardBgView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f34003a;

    /* JADX INFO: renamed from: b */
    public VText f34004b;

    /* JADX INFO: renamed from: c */
    public VText f34005c;

    public ExpFakeCardBgView(Context context) {
        super(context);
        m52133b();
    }

    /* JADX INFO: renamed from: b */
    public void m52133b() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(kec0.f125403F2, (ViewGroup) null);
        this.f34003a = (VImage) viewInflate.findViewById(adc0.f70359ge);
        this.f34004b = (VText) viewInflate.findViewById(adc0.f70393ie);
        this.f34005c = (VText) viewInflate.findViewById(adc0.f70376he);
        addView(viewInflate, bnl0.f77544e, bnl0.f77545f);
    }

    /* JADX INFO: renamed from: c */
    public void m52134c(int i, boolean z, boolean z2) {
        if (i >= 0 && i < getCardBgList().size()) {
            if (z2) {
                String str = getCardBgList().get(i).f152156a;
                this.f34004b.setText(str);
                bnl0.m105524M(this.f34004b, true);
                if (xra.m212798q() && TextUtils.isEmpty(str)) {
                    bnl0.m105524M(this.f34004b, false);
                }
            } else {
                bnl0.m105524M(this.f34004b, false);
            }
            this.f34003a.setBackgroundResource(getCardBgList().get(i).f152157b.intValue());
        }
        bnl0.m105524M(this.f34005c, false);
        this.f34005c.setText("");
        if (xra.m212798q() && CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode)) {
            z = false;
        }
        if (!z) {
            bnl0.m105524M(this.f34005c, false);
            return;
        }
        if (xra.m212804w()) {
            NewProfileCompletionConfig newProfileCompletionConfigM212800s = xra.m212800s();
            if (i >= newProfileCompletionConfigM212800s.weight.picture.size() || newProfileCompletionConfigM212800s.weight.picture.get(i).intValue() <= 0) {
                return;
            }
            bnl0.m105525M0(this.f34005c, true);
            this.f34005c.setText(Marker.ANY_NON_NULL_MARKER + newProfileCompletionConfigM212800s.weight.picture.get(i) + "%");
        }
    }

    public List<pf60<String, Integer>> getCardBgList() {
        return jyb.m147486Q(jyb.m147507f0("真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"), new qcj() { // from class: l.cff
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pf60.m172085a((String) obj, Integer.valueOf(kbc0.f124919w));
            }
        });
    }
}
