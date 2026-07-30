package com.p046p1.mobile.putong.core.p053ui.verification.remind.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VProgressBar;
import p147v.VText;
import p149l.e30;
import p149l.lrj0;
import p149l.qib0;
import p149l.uhf0;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SimpleUpdateAvatarView extends VFrame {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f36690a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f36691b;

    /* JADX INFO: renamed from: c */
    public VText f36692c;

    public SimpleUpdateAvatarView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56090s(this);
        if (upa.m194847z()) {
            this.f36692c.setBackgroundResource(x2c0.f190731y0);
            this.f36692c.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189154A0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m56090s(View view) {
        uhf0.m193713a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m56091u(Media media, int[] iArr) {
        if (NullChecker.m81303a(media) && NullChecker.m81303a(media.cover()) && NullChecker.m81303a(media.cover().url)) {
            qib0.f154691G.m102327J0(this.f36690a, media.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m56092v(lrj0.C18309b c18309b) {
        xdl0.m208344M(this.f36691b, c18309b.f129724a.isLoading());
        boolean zIsEmpty = TextUtils.isEmpty(c18309b.f129726c);
        VText vText = this.f36692c;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
            this.f36692c.setText(c18309b.f129726c);
        }
        final Media media = c18309b.f129725b;
        if (NullChecker.m81303a(media) && NullChecker.m81303a(media.cover()) && NullChecker.m81303a(media.cover().url)) {
            xdl0.m208353Q0(this.f36690a, new e30() { // from class: l.thf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170245a.m56091u(media, (int[]) obj);
                }
            });
        } else if (media instanceof Video) {
            qib0.f154691G.m102367m0(this.f36690a, media.url);
        } else {
            qib0.f154691G.m184725o(this.f36690a);
        }
    }

    public SimpleUpdateAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleUpdateAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
