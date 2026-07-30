package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.p051p1.mobile.putong.live.external.view.widgets.VoiceSquareRightOperateView;
import p151v.VImage;
import p153l.bnl0;
import p153l.fhw;
import p153l.hyn0;
import p153l.i4g0;
import p153l.iqn0;
import p153l.tbs;
import p153l.vxr;
import p153l.zrv;
import p153l.zuo0;

/* JADX INFO: loaded from: classes9.dex */
public class VoiceSquareRightOperateView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f47236a;

    /* JADX INFO: renamed from: b */
    public VImage f47237b;

    /* JADX INFO: renamed from: c */
    public VImage f47238c;

    public VoiceSquareRightOperateView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m72119a(Act act, View view) {
        String strM137760b = hyn0.m137760b(100019);
        fhw.m125605a("EnterRoomChecker", "isInterceptStartVoiceLives");
        if (MomentAllowForwardState.allow.equals(strM137760b)) {
            iqn0.m141677e(act, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m72122d(View view) {
        zuo0.m221684a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m72123e(final Act act) {
        bnl0.m105509E0(this.f47238c, new View.OnClickListener() { // from class: l.wuo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSquareRightOperateView.m72119a(act, view);
            }
        });
        if (tbs.f172989b.m203709q6() || vxr.m203876d().m170971D1()) {
            bnl0.m105524M(this.f47237b, true);
            bnl0.m105509E0(this.f47237b, new View.OnClickListener() { // from class: l.xuo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f196301a.m72124f(view);
                }
            });
        }
        final String strM203379B4 = zrv.m221193k().m203379B4();
        boolean zIsEmpty = TextUtils.isEmpty(strM203379B4);
        VImage vImage = this.f47236a;
        if (zIsEmpty) {
            bnl0.m105524M(vImage, false);
        } else {
            bnl0.m105524M(vImage, true);
            bnl0.m105509E0(this.f47236a, new View.OnClickListener() { // from class: l.yuo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nae0.m162083m(act, Uri.parse(strM203379B4));
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m72124f(View view) {
        getContext().startActivity(LiveSearchAct.m72012a2(getContext(), "intlVoiceLive"));
        i4g0.m138520r("e_anchor_search", "p_audio_explore_recommend");
    }

    /* JADX INFO: renamed from: g */
    public void m72125g(Act act) {
        m72123e(act);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72122d(this);
    }

    public VoiceSquareRightOperateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSquareRightOperateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
