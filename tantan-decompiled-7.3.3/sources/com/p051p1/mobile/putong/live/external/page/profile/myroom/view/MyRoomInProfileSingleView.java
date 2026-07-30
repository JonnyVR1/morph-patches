package com.p051p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.Iterator;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.fn2;
import p153l.fnd0;
import p153l.g23;
import p153l.h520;
import p153l.hk70;
import p153l.i420;
import p153l.izs;
import p153l.mbc0;
import p153l.pf60;
import p153l.q3d0;
import p153l.qa00;
import p153l.r230;
import p153l.ynp0;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileSingleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MyRoomInProfileSingleView f46819d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f46820e;

    /* JADX INFO: renamed from: f */
    public View f46821f;

    /* JADX INFO: renamed from: g */
    public View f46822g;

    /* JADX INFO: renamed from: h */
    public View f46823h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f46824i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f46825j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f46826k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f46827l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f46828m;

    /* JADX INFO: renamed from: n */
    public VImage f46829n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f46830o;

    /* JADX INFO: renamed from: p */
    public AnimEffectPlayer f46831p;

    /* JADX INFO: renamed from: q */
    public TextView f46832q;

    /* JADX INFO: renamed from: r */
    public TextView f46833r;

    /* JADX INFO: renamed from: s */
    public TextView f46834s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileSingleView$a */
    public class C12737a extends fn2 {
        public C12737a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            MyRoomInProfileSingleView.this.f46820e.post(new Runnable() { // from class: l.g520
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102276a.m71728k();
                }
            });
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m71728k() {
            MyRoomInProfileSingleView myRoomInProfileSingleView = MyRoomInProfileSingleView.this;
            ynp0.m216932i(false, myRoomInProfileSingleView.f46821f, myRoomInProfileSingleView.f46822g);
        }
    }

    public MyRoomInProfileSingleView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m71722k0(int i) {
        float f = qa00.f156322i;
        this.f46821f.setBackground(new fnd0(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f}, i));
        this.f46822g.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, Color.argb(0, Color.red(i), Color.green(i), Color.blue(i))}));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m71723j0(View view) {
        h520.m133622a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m71724l0(String str, String str2, final int i) {
        if (TextUtils.equals(str, str2)) {
            this.f46821f.post(new Runnable() { // from class: l.f520
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97184a.m71722k0(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m71725m0(i420 i420Var, Boolean bool) {
        bnl0.m105505C0(this.f46819d, qa00.m175859d(112.0f));
        boolean zM138391f = i420Var.m138391f();
        String str = i420Var.m138388c().m61308fp().profileMiddle().formatted();
        bnl0.m105524M(this.f46821f, !zM138391f);
        bnl0.m105524M(this.f46822g, !zM138391f);
        boolean zM138390e = i420Var.m138390e();
        bnl0.m105524M(this.f46834s, !zM138391f && zM138390e);
        View view = this.f46823h;
        int i = (zM138390e && zM138391f) ? mbc0.f135708u0 : mbc0.f135711x;
        view.setBackgroundResource(i);
        TextView textView = this.f46832q;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        this.f46833r.setTypeface(typeface);
        bnl0.m105524M(this.f46824i, false);
        bnl0.m105524M(this.f46826k, false);
        bnl0.m105524M(this.f46830o, false);
        bnl0.m105524M(this.f46829n, false);
        bnl0.m105524M(this.f46827l, false);
        if (!zM138390e) {
            TextView textView2 = this.f46832q;
            if (zM138391f) {
                bnl0.m105550d0(textView2, qa00.m175859d(20.0f));
                bnl0.m105550d0(this.f46833r, qa00.m175859d(20.0f));
                bnl0.m105524M(this.f46829n, true);
                this.f46832q.setText(R$string.f45071y1);
            } else {
                bnl0.m105550d0(textView2, qa00.m175859d(8.0f));
                bnl0.m105550d0(this.f46833r, qa00.m175859d(8.0f));
                bnl0.m105524M(this.f46826k, true);
                bnl0.m105524M(this.f46827l, true);
                this.f46832q.setText(R$string.f45040o0);
            }
        } else if (zM138391f) {
            this.f46832q.setText(R$string.f45037n0);
            bnl0.m105550d0(this.f46832q, qa00.m175859d(20.0f));
            bnl0.m105550d0(this.f46833r, qa00.m175859d(20.0f));
            bnl0.m105524M(this.f46830o, true);
            this.f46831p.m69683j("https://auto.tancdn.com/v1/raw/77e1a643-4ab1-4215-a7df-cac7b55b884912.pdf", -1);
        } else {
            boolean zM138389d = i420Var.m138389d();
            TextView textView3 = this.f46832q;
            if (zM138389d) {
                textView3.setText(R$string.f44989W);
                this.f46834s.setText(R$string.f44993Y);
            } else {
                textView3.setText(R$string.f44971N);
                this.f46834s.setText(R$string.f45042p);
            }
            bnl0.m105550d0(this.f46832q, qa00.m175859d(8.0f));
            bnl0.m105550d0(this.f46833r, qa00.m175859d(8.0f));
            bnl0.m105524M(this.f46824i, true);
            bnl0.m105524M(this.f46827l, true);
            this.f46825j.m69683j("https://auto.tancdn.com/v1/raw/abba7f84-cd90-45f7-ae91-088c8c77a40111.pdf", -1);
        }
        if (zM138391f) {
            BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) i420Var.m138387b();
            StringBuilder sb = new StringBuilder();
            Iterator<BLiveVoiceTopic> it = bLiveVoiceRoom.topics.iterator();
            while (it.hasNext()) {
                sb.append(it.next().name);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            String string = sb.toString();
            String strConcat = !TextUtils.isEmpty(string) ? string.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) : "";
            this.f46833r.setText(strConcat + bLiveVoiceRoom.title);
        } else {
            this.f46833r.setText(i420Var.m138387b().title);
        }
        m71726n0(bool, str);
        if (zM138391f) {
            int i2 = qa00.f156322i;
            this.f46820e.getHierarchy().m207045H(RoundingParams.m8302b(i2, i2, i2, i2));
            izs.m142873x(this.f46820e, mbc0.f135705t);
        } else {
            int i3 = qa00.f156322i;
            this.f46820e.getHierarchy().m207045H(RoundingParams.m8302b(0.0f, i3, i3, 0.0f));
            final String strM179478t = r230.m179478t(false, i420Var.m138387b().getCoverUrl(), this.f46820e, new q3d0(qa00.m175859d(640.0f), qa00.m175859d(640.0f)));
            g23.m128589f(this.f46820e, strM179478t, new hk70() { // from class: l.e520
                @Override // p153l.hk70
                /* JADX INFO: renamed from: a */
                public final void mo119505a(String str2, int i4) {
                    this.f92177a.m71724l0(strM179478t, str2, i4);
                }
            }, new C12737a());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m71726n0(Boolean bool, String str) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                izs.m142868s("context_square", this.f46828m, str);
            } else {
                pf60<Integer, Integer> pf60VarM128590g = g23.m128590g(0);
                izs.m142865p("context_square", this.f46828m, str, pf60VarM128590g.f152156a.intValue(), pf60VarM128590g.f152157b.intValue());
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71723j0(this);
    }

    public MyRoomInProfileSingleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileSingleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
