package p149l;

import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;

/* JADX INFO: loaded from: classes5.dex */
public class s0o0<V extends RelativeLayout> extends d1q<V> {

    /* JADX INFO: renamed from: a */
    public BLiveVoiceEmojiMenuButton f161791a;

    /* JADX INFO: renamed from: b */
    public e30<BLiveVoiceEmojiMenuButton> f161792b;

    public s0o0(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        this.f161791a = bLiveVoiceEmojiMenuButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m181874I(View view) {
        BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton;
        e30<BLiveVoiceEmojiMenuButton> e30Var = this.f161792b;
        if (e30Var == null || (bLiveVoiceEmojiMenuButton = this.f161791a) == null) {
            return;
        }
        e30Var.call(bLiveVoiceEmojiMenuButton);
    }

    /* JADX INFO: renamed from: J */
    public void m181875J(V v2) {
        super.mo70566u(v2);
        xdl0.m208329E0(v2, new View.OnClickListener() { // from class: l.r0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157184a.m181874I(view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public void m181876K(e30<BLiveVoiceEmojiMenuButton> e30Var) {
        this.f161792b = e30Var;
    }
}
