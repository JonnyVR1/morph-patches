package com.p051p1.mobile.putong.core.p058ui.verification.remind.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VProgressBar;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.dqf0;
import p153l.gra;
import p153l.p0k0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class SimpleUpdateAvatarView extends VFrame {

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f37538a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f37539b;

    /* JADX INFO: renamed from: c */
    public VText f37540c;

    public SimpleUpdateAvatarView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57273s(this);
        if (gra.m131778z()) {
            this.f37540c.setBackgroundResource(dbc0.f87626z0);
            this.f37540c.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86009B0, 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m57273s(View view) {
        dqf0.m117520a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m57274u(Media media, int[] iArr) {
        if (NullChecker.m82486a(media) && NullChecker.m82486a(media.cover()) && NullChecker.m82486a(media.cover().url)) {
            uqb0.f180374G.m127111J0(this.f37538a, media.cover().profile480(), false);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m57275v(p0k0.C19267b c19267b) {
        bnl0.m105524M(this.f37539b, c19267b.f150064a.isLoading());
        boolean zIsEmpty = TextUtils.isEmpty(c19267b.f150066c);
        VText vText = this.f37540c;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
            this.f37540c.setText(c19267b.f150066c);
        }
        final Media media = c19267b.f150065b;
        if (NullChecker.m82486a(media) && NullChecker.m82486a(media.cover()) && NullChecker.m82486a(media.cover().url)) {
            bnl0.m105533Q0(this.f37538a, new y20() { // from class: l.cqf0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f83084a.m57274u(media, (int[]) obj);
                }
            });
        } else if (media instanceof Video) {
            uqb0.f180374G.m127150m0(this.f37538a, media.url);
        } else {
            uqb0.f180374G.m98798o(this.f37538a);
        }
    }

    public SimpleUpdateAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleUpdateAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
