package com.p000p1.mobile.putong.core.p004ui.verification.remind.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.lrj0;
import l.uhf0;
import l.xdl0;
import p006l.qib0;
import p006l.upa;
import p006l.x2c0;
import v.VFrame;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SimpleUpdateAvatarView extends VFrame {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f6471a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f6472b;

    /* JADX INFO: renamed from: c */
    public VText f6473c;

    public SimpleUpdateAvatarView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9515s(this);
        if (upa.m25545z()) {
            this.f6473c.setBackgroundResource(x2c0.f27267y0);
            this.f6473c.setCompoundDrawablesWithIntrinsicBounds(x2c0.f25690A0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m9515s(View view) {
        uhf0.a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m9516u(Media media, int[] iArr) {
        if (NullChecker.a(media) && NullChecker.a(media.cover()) && NullChecker.a(((Media) media.cover()).url)) {
            qib0.f19782G.m12740J0(this.f6471a, media.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m9517v(lrj0.b bVar) {
        xdl0.M(this.f6472b, bVar.a.isLoading());
        boolean zIsEmpty = TextUtils.isEmpty(bVar.c);
        VText vText = this.f6473c;
        if (zIsEmpty) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, true);
            this.f6473c.setText(bVar.c);
        }
        final Media media = bVar.b;
        if (NullChecker.a(media) && NullChecker.a(media.cover()) && NullChecker.a(((Media) media.cover()).url)) {
            xdl0.Q0(this.f6471a, new e30() { // from class: l.thf0
                public final void call(Object obj) {
                    this.f22115a.m9516u(media, (int[]) obj);
                }
            });
        } else if (media instanceof Video) {
            qib0.f19782G.m12780m0(this.f6471a, media.url);
        } else {
            qib0.f19782G.o(this.f6471a);
        }
    }

    public SimpleUpdateAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleUpdateAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
