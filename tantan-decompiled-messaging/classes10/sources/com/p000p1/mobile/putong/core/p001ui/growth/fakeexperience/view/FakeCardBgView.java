package com.p000p1.mobile.putong.core.p001ui.growth.fakeexperience.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.NewProfileCompletionConfig;
import com.p000p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p000p1.mobile.putong.core.data.UserHomeMode;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCard;
import java.util.List;
import l.a5c0;
import l.eqh0;
import l.j760;
import l.n6c0;
import l.t100;
import l.xdl0;
import p003l.lqa;
import p003l.vwf;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FakeCardBgView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f1920a;

    /* JADX INFO: renamed from: b */
    public VText f1921b;

    /* JADX INFO: renamed from: c */
    public VText f1922c;

    /* JADX INFO: renamed from: d */
    public vwf f1923d;

    /* JADX INFO: renamed from: e */
    public MediaReorderCard.CardDataType f1924e;

    public FakeCardBgView(Context context, MediaReorderCard.CardDataType cardDataType) {
        super(context);
        this.f1924e = cardDataType;
        m3328a();
    }

    /* JADX INFO: renamed from: a */
    public void m3328a() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(n6c0.t0, (ViewGroup) null);
        this.f1920a = viewInflate.findViewById(a5c0.V);
        this.f1921b = viewInflate.findViewById(a5c0.X);
        this.f1922c = viewInflate.findViewById(a5c0.W);
        this.f1923d = new vwf().m10387b(getContext(), this.f1924e);
        addView(viewInflate);
        if (lqa.m7789w() || lqa.m7778l()) {
            xdl0.X(this.f1921b, t100.h);
            int i = t100.q;
            xdl0.D0(i, new View[]{this.f1920a});
            xdl0.C0(this.f1920a, i);
            this.f1921b.setTypeface(eqh0.c(3), 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3329b(int i) {
        List<j760<String, Integer>> list = this.f1923d.f8085e;
        if (i >= 0 && i < list.size()) {
            if (lqa.m7780n()) {
                VText vText = this.f1921b;
                if (i < 3) {
                    vText.setText((CharSequence) list.get(i).a);
                    xdl0.M(this.f1921b, true);
                } else {
                    xdl0.M(vText, false);
                }
            } else {
                this.f1921b.setText((CharSequence) list.get(i).a);
            }
            this.f1920a.setBackgroundResource(((Integer) list.get(i).b).intValue());
        }
        xdl0.M(this.f1922c, false);
    }

    /* JADX INFO: renamed from: c */
    public void m3330c(int i, boolean z) {
        List<j760<String, Integer>> list = this.f1923d.f8085e;
        if (i >= 0 && i < list.size()) {
            String str = (String) list.get(i).a;
            if ((lqa.m7777k() || lqa.m7779m()) && !z && i >= 3) {
                xdl0.M(this.f1921b, false);
            } else {
                this.f1921b.setText(str);
                xdl0.M(this.f1921b, true);
            }
            if (lqa.m7783q() && TextUtils.isEmpty(str)) {
                xdl0.M(this.f1921b, false);
            }
            this.f1920a.setBackgroundResource(((Integer) list.get(i).b).intValue());
        }
        xdl0.M0(this.f1922c, false);
        this.f1922c.setText("");
        if (lqa.m7783q() && ((String) CoreModule.c.e0.Z3.get()).equals(UserHomeMode.marryMode)) {
            z = false;
        }
        if (!z) {
            xdl0.M(this.f1922c, false);
            return;
        }
        if (lqa.m7789w()) {
            NewProfileCompletionConfig newProfileCompletionConfigM7785s = lqa.m7785s();
            if (i >= newProfileCompletionConfigM7785s.weight.picture.size() || newProfileCompletionConfigM7785s.weight.picture.get(i).intValue() <= 0) {
                return;
            }
            xdl0.M0(this.f1922c, true);
            this.f1922c.setText("+" + newProfileCompletionConfigM7785s.weight.picture.get(i) + "%");
            return;
        }
        if (lqa.m7774h()) {
            ProfileCompletionConfig profileCompletionConfigM7769c = lqa.m7769c();
            if (i >= profileCompletionConfigM7769c.weight.picture.size() || profileCompletionConfigM7769c.weight.picture.get(i).intValue() <= 0) {
                return;
            }
            xdl0.M0(this.f1922c, true);
            this.f1922c.setText("+" + profileCompletionConfigM7769c.weight.picture.get(i) + "%");
        }
    }
}
