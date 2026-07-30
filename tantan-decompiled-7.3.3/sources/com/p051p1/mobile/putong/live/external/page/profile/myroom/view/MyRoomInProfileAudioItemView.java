package com.p051p1.mobile.putong.live.external.page.profile.myroom.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTopic;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.Iterator;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.e420;
import p153l.gfj0;
import p153l.i420;
import p153l.izs;
import p153l.mbc0;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileAudioItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46807d;

    /* JADX INFO: renamed from: e */
    public VImage f46808e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f46809f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f46810g;

    /* JADX INFO: renamed from: h */
    public TextView f46811h;

    /* JADX INFO: renamed from: i */
    public TextView f46812i;

    public MyRoomInProfileAudioItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m71713h0(View view) {
        e420.m119338a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m71714i0(i420 i420Var) {
        boolean zM138391f = i420Var.m138391f();
        boolean zM138390e = i420Var.m138390e();
        izs.m142873x(this.f46807d, mbc0.f135705t);
        if (zM138391f) {
            gfj0.m130079g(i420Var, zM138391f);
            izs.m142873x(this.f46807d, mbc0.f135705t);
            TextView textView = this.f46811h;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView.setTypeface(typeface);
            this.f46812i.setTypeface(typeface);
            BLiveVoiceRoom bLiveVoiceRoom = (BLiveVoiceRoom) i420Var.m138387b();
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
            this.f46812i.setText(string + bLiveVoiceRoom.title);
            bnl0.m105524M(this.f46808e, false);
            bnl0.m105524M(this.f46809f, false);
            if (!zM138390e) {
                bnl0.m105524M(this.f46808e, true);
                this.f46811h.setText(R$string.f45071y1);
            } else {
                bnl0.m105524M(this.f46809f, true);
                bnl0.m105524M(this.f46809f, true);
                this.f46810g.m69683j("https://auto.tancdn.com/v1/raw/77e1a643-4ab1-4215-a7df-cac7b55b884912.pdf", -1);
                this.f46811h.setText(R$string.f45037n0);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71713h0(this);
    }

    public MyRoomInProfileAudioItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyRoomInProfileAudioItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
