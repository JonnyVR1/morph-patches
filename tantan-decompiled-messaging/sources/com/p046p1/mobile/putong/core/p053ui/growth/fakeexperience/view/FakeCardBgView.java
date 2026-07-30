package com.p046p1.mobile.putong.core.p053ui.growth.fakeexperience.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NewProfileCompletionConfig;
import com.p046p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import java.util.List;
import org.slf4j.Marker;
import p147v.VImage;
import p147v.VText;
import p149l.a5c0;
import p149l.eqh0;
import p149l.j760;
import p149l.lqa;
import p149l.n6c0;
import p149l.t100;
import p149l.vwf;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class FakeCardBgView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f29526a;

    /* JADX INFO: renamed from: b */
    public VText f29527b;

    /* JADX INFO: renamed from: c */
    public VText f29528c;

    /* JADX INFO: renamed from: d */
    public vwf f29529d;

    /* JADX INFO: renamed from: e */
    public MediaReorderCard.CardDataType f29530e;

    public FakeCardBgView(Context context, MediaReorderCard.CardDataType cardDataType) {
        super(context);
        this.f29530e = cardDataType;
        m45973a();
    }

    /* JADX INFO: renamed from: a */
    public void m45973a() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(n6c0.f137379t0, (ViewGroup) null);
        this.f29526a = (VImage) viewInflate.findViewById(a5c0.f67668V);
        this.f29527b = (VText) viewInflate.findViewById(a5c0.f67670X);
        this.f29528c = (VText) viewInflate.findViewById(a5c0.f67669W);
        this.f29529d = new vwf().m200368b(getContext(), this.f29530e);
        addView(viewInflate);
        if (lqa.m150985w() || lqa.m150974l()) {
            xdl0.m208360X(this.f29527b, t100.f167259h);
            int i = t100.f167268q;
            xdl0.m208327D0(i, this.f29526a);
            xdl0.m208325C0(this.f29526a, i);
            this.f29527b.setTypeface(eqh0.m117752c(3), 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m45974b(int i) {
        List<j760<String, Integer>> list = this.f29529d.f183335e;
        if (i >= 0 && i < list.size()) {
            if (lqa.m150976n()) {
                VText vText = this.f29527b;
                if (i < 3) {
                    vText.setText(list.get(i).f116564a);
                    xdl0.m208344M(this.f29527b, true);
                } else {
                    xdl0.m208344M(vText, false);
                }
            } else {
                this.f29527b.setText(list.get(i).f116564a);
            }
            this.f29526a.setBackgroundResource(list.get(i).f116565b.intValue());
        }
        xdl0.m208344M(this.f29528c, false);
    }

    /* JADX INFO: renamed from: c */
    public void m45975c(int i, boolean z) {
        List<j760<String, Integer>> list = this.f29529d.f183335e;
        if (i >= 0 && i < list.size()) {
            String str = list.get(i).f116564a;
            if ((lqa.m150973k() || lqa.m150975m()) && !z && i >= 3) {
                xdl0.m208344M(this.f29527b, false);
            } else {
                this.f29527b.setText(str);
                xdl0.m208344M(this.f29527b, true);
            }
            if (lqa.m150979q() && TextUtils.isEmpty(str)) {
                xdl0.m208344M(this.f29527b, false);
            }
            this.f29526a.setBackgroundResource(list.get(i).f116565b.intValue());
        }
        xdl0.m208345M0(this.f29528c, false);
        this.f29528c.setText("");
        if (lqa.m150979q() && CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode)) {
            z = false;
        }
        if (!z) {
            xdl0.m208344M(this.f29528c, false);
            return;
        }
        if (lqa.m150985w()) {
            NewProfileCompletionConfig newProfileCompletionConfigM150981s = lqa.m150981s();
            if (i >= newProfileCompletionConfigM150981s.weight.picture.size() || newProfileCompletionConfigM150981s.weight.picture.get(i).intValue() <= 0) {
                return;
            }
            xdl0.m208345M0(this.f29528c, true);
            this.f29528c.setText(Marker.ANY_NON_NULL_MARKER + newProfileCompletionConfigM150981s.weight.picture.get(i) + "%");
            return;
        }
        if (lqa.m150970h()) {
            ProfileCompletionConfig profileCompletionConfigM150965c = lqa.m150965c();
            if (i >= profileCompletionConfigM150965c.weight.picture.size() || profileCompletionConfigM150965c.weight.picture.get(i).intValue() <= 0) {
                return;
            }
            xdl0.m208345M0(this.f29528c, true);
            this.f29528c.setText(Marker.ANY_NON_NULL_MARKER + profileCompletionConfigM150965c.weight.picture.get(i) + "%");
        }
    }
}
