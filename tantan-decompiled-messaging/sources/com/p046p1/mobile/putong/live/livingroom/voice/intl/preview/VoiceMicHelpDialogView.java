package com.p046p1.mobile.putong.live.livingroom.voice.intl.preview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceModelDescribe;
import p147v.VText;
import p149l.d30;
import p149l.u1o0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceMicHelpDialogView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceMicHelpDialogView f53338a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f53339b;

    /* JADX INFO: renamed from: c */
    public VText f53340c;

    /* JADX INFO: renamed from: d */
    public VText f53341d;

    /* JADX INFO: renamed from: e */
    public VText f53342e;

    /* JADX INFO: renamed from: f */
    public VText f53343f;

    /* JADX INFO: renamed from: g */
    public VText f53344g;

    public VoiceMicHelpDialogView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m78353b(View view) {
        u1o0.m191427a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m78354c(BLiveVoiceModelDescribe bLiveVoiceModelDescribe, final d30 d30Var) {
        this.f53340c.setText(bLiveVoiceModelDescribe.title);
        if (!TextUtils.isEmpty(bLiveVoiceModelDescribe.content3) || !TextUtils.isEmpty(bLiveVoiceModelDescribe.content5)) {
            xdl0.m208344M(this.f53341d, true);
            this.f53341d.setText(TextUtils.isEmpty(bLiveVoiceModelDescribe.content3) ? bLiveVoiceModelDescribe.content5 : bLiveVoiceModelDescribe.content3);
        }
        if (!TextUtils.isEmpty(bLiveVoiceModelDescribe.content9)) {
            xdl0.m208344M(this.f53342e, true);
            this.f53342e.setText(bLiveVoiceModelDescribe.content9);
        }
        this.f53343f.setText(bLiveVoiceModelDescribe.content10);
        xdl0.m208329E0(this.f53344g, new View.OnClickListener() { // from class: l.t1o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78353b(this);
    }

    public VoiceMicHelpDialogView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMicHelpDialogView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
