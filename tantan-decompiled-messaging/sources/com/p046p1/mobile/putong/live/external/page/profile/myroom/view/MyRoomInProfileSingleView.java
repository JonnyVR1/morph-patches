package com.p046p1.mobile.putong.live.external.page.profile.myroom.view;

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
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.Iterator;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.aw10;
import p149l.bc70;
import p149l.dfd0;
import p149l.g3c0;
import p149l.hu20;
import p149l.hxs;
import p149l.j760;
import p149l.nvc0;
import p149l.r13;
import p149l.t100;
import p149l.uep0;
import p149l.xdl0;
import p149l.ym2;
import p149l.zw10;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileSingleView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MyRoomInProfileSingleView f45971d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f45972e;

    /* JADX INFO: renamed from: f */
    public View f45973f;

    /* JADX INFO: renamed from: g */
    public View f45974g;

    /* JADX INFO: renamed from: h */
    public View f45975h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f45976i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f45977j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f45978k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f45979l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f45980m;

    /* JADX INFO: renamed from: n */
    public VImage f45981n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f45982o;

    /* JADX INFO: renamed from: p */
    public AnimEffectPlayer f45983p;

    /* JADX INFO: renamed from: q */
    public TextView f45984q;

    /* JADX INFO: renamed from: r */
    public TextView f45985r;

    /* JADX INFO: renamed from: s */
    public TextView f45986s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInProfileSingleView$a */
    public class C12574a extends ym2 {
        public C12574a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            MyRoomInProfileSingleView.this.f45972e.post(new Runnable() { // from class: l.yw10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f200357a.m70545k();
                }
            });
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m70545k() {
            MyRoomInProfileSingleView myRoomInProfileSingleView = MyRoomInProfileSingleView.this;
            uep0.m193322i(false, myRoomInProfileSingleView.f45973f, myRoomInProfileSingleView.f45974g);
        }
    }

    public MyRoomInProfileSingleView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m70539k0(int i) {
        float f = t100.f167260i;
        this.f45973f.setBackground(new dfd0(new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f}, i));
        this.f45974g.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{i, Color.argb(0, Color.red(i), Color.green(i), Color.blue(i))}));
    }

    /* JADX INFO: renamed from: j0 */
    public final void m70540j0(View view) {
        zw10.m220505a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m70541l0(String str, String str2, final int i) {
        if (TextUtils.equals(str, str2)) {
            this.f45973f.post(new Runnable() { // from class: l.xw10
                @Override // java.lang.Runnable
                public final void run() {
                    this.f194685a.m70539k0(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m70542m0(aw10 aw10Var, Boolean bool) {
        xdl0.m208325C0(this.f45971d, t100.m186890d(112.0f));
        boolean zM99228f = aw10Var.m99228f();
        String str = aw10Var.m99225c().m60124fp().profileMiddle().formatted();
        xdl0.m208344M(this.f45973f, !zM99228f);
        xdl0.m208344M(this.f45974g, !zM99228f);
        boolean zM99227e = aw10Var.m99227e();
        xdl0.m208344M(this.f45986s, !zM99228f && zM99227e);
        View view = this.f45975h;
        int i = (zM99227e && zM99228f) ? g3c0.f100446u0 : g3c0.f100449x;
        view.setBackgroundResource(i);
        TextView textView = this.f45984q;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        this.f45985r.setTypeface(typeface);
        xdl0.m208344M(this.f45976i, false);
        xdl0.m208344M(this.f45978k, false);
        xdl0.m208344M(this.f45982o, false);
        xdl0.m208344M(this.f45981n, false);
        xdl0.m208344M(this.f45979l, false);
        if (!zM99227e) {
            TextView textView2 = this.f45984q;
            if (zM99228f) {
                xdl0.m208370d0(textView2, t100.m186890d(20.0f));
                xdl0.m208370d0(this.f45985r, t100.m186890d(20.0f));
                xdl0.m208344M(this.f45981n, true);
                this.f45984q.setText(R$string.f44223y1);
            } else {
                xdl0.m208370d0(textView2, t100.m186890d(8.0f));
                xdl0.m208370d0(this.f45985r, t100.m186890d(8.0f));
                xdl0.m208344M(this.f45978k, true);
                xdl0.m208344M(this.f45979l, true);
                this.f45984q.setText(R$string.f44192o0);
            }
        } else if (zM99228f) {
            this.f45984q.setText(R$string.f44189n0);
            xdl0.m208370d0(this.f45984q, t100.m186890d(20.0f));
            xdl0.m208370d0(this.f45985r, t100.m186890d(20.0f));
            xdl0.m208344M(this.f45982o, true);
            this.f45983p.m68500j("https://auto.tancdn.com/v1/raw/77e1a643-4ab1-4215-a7df-cac7b55b884912.pdf", -1);
        } else {
            boolean zM99226d = aw10Var.m99226d();
            TextView textView3 = this.f45984q;
            if (zM99226d) {
                textView3.setText(R$string.f44141W);
                this.f45986s.setText(R$string.f44145Y);
            } else {
                textView3.setText(R$string.f44123N);
                this.f45986s.setText(R$string.f44194p);
            }
            xdl0.m208370d0(this.f45984q, t100.m186890d(8.0f));
            xdl0.m208370d0(this.f45985r, t100.m186890d(8.0f));
            xdl0.m208344M(this.f45976i, true);
            xdl0.m208344M(this.f45979l, true);
            this.f45977j.m68500j("https://auto.tancdn.com/v1/raw/abba7f84-cd90-45f7-ae91-088c8c77a40111.pdf", -1);
        }
        if (zM99228f) {
            BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) aw10Var.m99224b();
            StringBuilder sb = new StringBuilder();
            Iterator<BLiveVoiceTopic> it = bLiveVoiceRoom.topics.iterator();
            while (it.hasNext()) {
                sb.append(it.next().name);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            String string = sb.toString();
            String strConcat = !TextUtils.isEmpty(string) ? string.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) : "";
            this.f45985r.setText(strConcat + bLiveVoiceRoom.title);
        } else {
            this.f45985r.setText(aw10Var.m99224b().title);
        }
        m70543n0(bool, str);
        if (zM99228f) {
            int i2 = t100.f167260i;
            this.f45972e.getHierarchy().m112053H(RoundingParams.m8248b(i2, i2, i2, i2));
            hxs.m133411x(this.f45972e, g3c0.f100443t);
        } else {
            int i3 = t100.f167260i;
            this.f45972e.getHierarchy().m112053H(RoundingParams.m8248b(0.0f, i3, i3, 0.0f));
            final String strM132973t = hu20.m132973t(false, aw10Var.m99224b().getCoverUrl(), this.f45972e, new nvc0(t100.m186890d(640.0f), t100.m186890d(640.0f)));
            r13.m177441f(this.f45972e, strM132973t, new bc70() { // from class: l.ww10
                @Override // p149l.bc70
                /* JADX INFO: renamed from: a */
                public final void mo101047a(String str2, int i4) {
                    this.f188303a.m70541l0(strM132973t, str2, i4);
                }
            }, new C12574a());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m70543n0(Boolean bool, String str) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                hxs.m133406s("context_square", this.f45980m, str);
            } else {
                j760<Integer, Integer> j760VarM177442g = r13.m177442g(0);
                hxs.m133403p("context_square", this.f45980m, str, j760VarM177442g.f116564a.intValue(), j760VarM177442g.f116565b.intValue());
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70540j0(this);
    }

    public MyRoomInProfileSingleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileSingleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
