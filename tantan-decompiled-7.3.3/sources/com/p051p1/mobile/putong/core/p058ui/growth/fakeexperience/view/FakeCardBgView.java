package com.p051p1.mobile.putong.core.p058ui.growth.fakeexperience.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NewProfileCompletionConfig;
import com.p051p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import java.util.List;
import org.slf4j.Marker;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gdc0;
import p153l.jyf;
import p153l.lyh0;
import p153l.pf60;
import p153l.qa00;
import p153l.sec0;
import p153l.xra;

/* JADX INFO: loaded from: classes3.dex */
public class FakeCardBgView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f30374a;

    /* JADX INFO: renamed from: b */
    public VText f30375b;

    /* JADX INFO: renamed from: c */
    public VText f30376c;

    /* JADX INFO: renamed from: d */
    public jyf f30377d;

    /* JADX INFO: renamed from: e */
    public MediaReorderCard.CardDataType f30378e;

    public FakeCardBgView(Context context, MediaReorderCard.CardDataType cardDataType) {
        super(context);
        this.f30378e = cardDataType;
        m47156a();
    }

    /* JADX INFO: renamed from: a */
    public void m47156a() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(sec0.f167593t0, (ViewGroup) null);
        this.f30374a = (VImage) viewInflate.findViewById(gdc0.f103663V);
        this.f30375b = (VText) viewInflate.findViewById(gdc0.f103665X);
        this.f30376c = (VText) viewInflate.findViewById(gdc0.f103664W);
        this.f30377d = new jyf().m147541b(getContext(), this.f30378e);
        addView(viewInflate);
        if (xra.m212804w() || xra.m212793l()) {
            bnl0.m105540X(this.f30375b, qa00.f156321h);
            int i = qa00.f156330q;
            bnl0.m105507D0(i, this.f30374a);
            bnl0.m105505C0(this.f30374a, i);
            this.f30375b.setTypeface(lyh0.m156283c(3), 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m47157b(int i) {
        List<pf60<String, Integer>> list = this.f30377d.f123135e;
        if (i >= 0 && i < list.size()) {
            if (xra.m212795n()) {
                VText vText = this.f30375b;
                if (i < 3) {
                    vText.setText(list.get(i).f152156a);
                    bnl0.m105524M(this.f30375b, true);
                } else {
                    bnl0.m105524M(vText, false);
                }
            } else {
                this.f30375b.setText(list.get(i).f152156a);
            }
            this.f30374a.setBackgroundResource(list.get(i).f152157b.intValue());
        }
        bnl0.m105524M(this.f30376c, false);
    }

    /* JADX INFO: renamed from: c */
    public void m47158c(int i, boolean z) {
        List<pf60<String, Integer>> list = this.f30377d.f123135e;
        if (i >= 0 && i < list.size()) {
            String str = list.get(i).f152156a;
            if ((xra.m212792k() || xra.m212794m()) && !z && i >= 3) {
                bnl0.m105524M(this.f30375b, false);
            } else {
                this.f30375b.setText(str);
                bnl0.m105524M(this.f30375b, true);
            }
            if (xra.m212798q() && TextUtils.isEmpty(str)) {
                bnl0.m105524M(this.f30375b, false);
            }
            this.f30374a.setBackgroundResource(list.get(i).f152157b.intValue());
        }
        bnl0.m105525M0(this.f30376c, false);
        this.f30376c.setText("");
        if (xra.m212798q() && CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode)) {
            z = false;
        }
        if (!z) {
            bnl0.m105524M(this.f30376c, false);
            return;
        }
        if (xra.m212804w()) {
            NewProfileCompletionConfig newProfileCompletionConfigM212800s = xra.m212800s();
            if (i >= newProfileCompletionConfigM212800s.weight.picture.size() || newProfileCompletionConfigM212800s.weight.picture.get(i).intValue() <= 0) {
                return;
            }
            bnl0.m105525M0(this.f30376c, true);
            this.f30376c.setText(Marker.ANY_NON_NULL_MARKER + newProfileCompletionConfigM212800s.weight.picture.get(i) + "%");
            return;
        }
        if (xra.m212789h()) {
            ProfileCompletionConfig profileCompletionConfigM212784c = xra.m212784c();
            if (i >= profileCompletionConfigM212784c.weight.picture.size() || profileCompletionConfigM212784c.weight.picture.get(i).intValue() <= 0) {
                return;
            }
            bnl0.m105525M0(this.f30376c, true);
            this.f30376c.setText(Marker.ANY_NON_NULL_MARKER + profileCompletionConfigM212784c.weight.picture.get(i) + "%");
        }
    }
}
