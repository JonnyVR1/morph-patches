package com.p046p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.Iterator;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.aw10;
import p149l.c6j0;
import p149l.g3c0;
import p149l.hxs;
import p149l.wv10;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileAudioItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f45959d;

    /* JADX INFO: renamed from: e */
    public VImage f45960e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f45961f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f45962g;

    /* JADX INFO: renamed from: h */
    public TextView f45963h;

    /* JADX INFO: renamed from: i */
    public TextView f45964i;

    public MyRoomInProfileAudioItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m70530h0(View view) {
        wv10.m205714a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m70531i0(aw10 aw10Var) {
        boolean zM99228f = aw10Var.m99228f();
        boolean zM99227e = aw10Var.m99227e();
        hxs.m133411x(this.f45959d, g3c0.f100443t);
        if (zM99228f) {
            c6j0.m105481g(aw10Var, zM99228f);
            hxs.m133411x(this.f45959d, g3c0.f100443t);
            TextView textView = this.f45963h;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView.setTypeface(typeface);
            this.f45964i.setTypeface(typeface);
            BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) aw10Var.m99224b();
            StringBuilder sb = new StringBuilder();
            Iterator<BLiveVoiceTopic> it = bLiveVoiceRoom.topics.iterator();
            while (it.hasNext()) {
                sb.append("#" + it.next().name + "#");
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            this.f45964i.setText(string + bLiveVoiceRoom.title);
            xdl0.m208344M(this.f45960e, false);
            xdl0.m208344M(this.f45961f, false);
            if (!zM99227e) {
                xdl0.m208344M(this.f45960e, true);
                this.f45963h.setText(R$string.f44223y1);
            } else {
                xdl0.m208344M(this.f45961f, true);
                xdl0.m208344M(this.f45961f, true);
                this.f45962g.m68500j("https://auto.tancdn.com/v1/raw/77e1a643-4ab1-4215-a7df-cac7b55b884912.pdf", -1);
                this.f45963h.setText(R$string.f44189n0);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70530h0(this);
    }

    public MyRoomInProfileAudioItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileAudioItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
