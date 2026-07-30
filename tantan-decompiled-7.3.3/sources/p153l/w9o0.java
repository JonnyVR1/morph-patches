package p153l;

import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;

/* JADX INFO: loaded from: classes5.dex */
public class w9o0<V extends RelativeLayout> extends d3q<V> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceEmojiMenuButton f188043a;

    /* JADX INFO: renamed from: b */
    public y20<BLiveVoiceEmojiMenuButton> f188044b;

    public w9o0(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        this.f188043a = bLiveVoiceEmojiMenuButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m205608I(View view) {
        BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton;
        y20<BLiveVoiceEmojiMenuButton> y20Var = this.f188044b;
        if (y20Var == null || (bLiveVoiceEmojiMenuButton = this.f188043a) == null) {
            return;
        }
        y20Var.call(bLiveVoiceEmojiMenuButton);
    }

    /* JADX INFO: renamed from: J */
    public void m205609J(V v2) {
        super.mo71749u(v2);
        bnl0.m105509E0(v2, new View.OnClickListener() { // from class: l.v9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183011a.m205608I(view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public void m205610K(y20<BLiveVoiceEmojiMenuButton> y20Var) {
        this.f188044b = y20Var;
    }
}
