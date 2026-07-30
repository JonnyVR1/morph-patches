package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.p046p1.mobile.putong.live.external.view.widgets.VoiceSquareRightOperateView;
import p147v.VImage;
import p149l.dpn0;
import p149l.ehn0;
import p149l.hfw;
import p149l.s9s;
import p149l.uvr;
import p149l.vlo0;
import p149l.xdl0;
import p149l.ypv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class VoiceSquareRightOperateView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f46388a;

    /* JADX INFO: renamed from: b */
    public VImage f46389b;

    /* JADX INFO: renamed from: c */
    public VImage f46390c;

    public VoiceSquareRightOperateView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m70936a(Act act, View view) {
        String strM112919b = dpn0.m112919b(100019);
        hfw.m130790a("EnterRoomChecker", "isInterceptStartVoiceLives");
        if (MomentAllowForwardState.allow.equals(strM112919b)) {
            ehn0.m116502e(act, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m70939d(View view) {
        vlo0.m198822a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m70940e(final Act act) {
        xdl0.m208329E0(this.f46390c, new View.OnClickListener() { // from class: l.slo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoiceSquareRightOperateView.m70936a(act, view);
            }
        });
        if (s9s.f163228b.m195922q6() || uvr.m196087d().m162664D1()) {
            xdl0.m208344M(this.f46389b, true);
            xdl0.m208329E0(this.f46389b, new View.OnClickListener() { // from class: l.tlo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171038a.m70941f(view);
                }
            });
        }
        final String strM195592B4 = ypv.m215672k().m195592B4();
        boolean zIsEmpty = TextUtils.isEmpty(strM195592B4);
        VImage vImage = this.f46388a;
        if (zIsEmpty) {
            xdl0.m208344M(vImage, false);
        } else {
            xdl0.m208344M(vImage, true);
            xdl0.m208329E0(this.f46388a, new View.OnClickListener() { // from class: l.ulo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    j2e0.m139446m(act, Uri.parse(strM195592B4));
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m70941f(View view) {
        getContext().startActivity(LiveSearchAct.m70829Z1(getContext(), "intlVoiceLive"));
        zvf0.m220396r("e_anchor_search", "p_audio_explore_recommend");
    }

    /* JADX INFO: renamed from: g */
    public void m70942g(Act act) {
        m70940e(act);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70939d(this);
    }

    public VoiceSquareRightOperateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSquareRightOperateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
