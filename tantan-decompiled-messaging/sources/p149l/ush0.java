package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes10.dex */
public class ush0 extends szd {

    /* JADX INFO: renamed from: j */
    public TextView f177972j;

    /* JADX INFO: renamed from: k */
    public TextView f177973k;

    /* JADX INFO: renamed from: l */
    public TextView f177974l;

    /* JADX INFO: renamed from: m */
    public TextView f177975m;

    /* JADX INFO: renamed from: n */
    public final String f177976n;

    /* JADX INFO: renamed from: o */
    public final Act f177977o;

    public ush0(Act act, String str) {
        super(act, false, v7c0.f180369p);
        this.f177976n = str;
        this.f177977o = act;
    }

    /* JADX INFO: renamed from: H */
    private void m195200H() {
        if (TextUtils.equals(this.f177976n, "from_heartbeat")) {
            this.f177973k.setText("恭喜你成功添加了标签，已开启本次心动信号！");
            this.f177974l.setText("去聊天");
        } else if (TextUtils.equals(this.f177976n, "from_card_tag_guide")) {
            this.f177973k.setText("恭喜你成功添加了标签，将会加大曝光为你寻找更合适的人！");
            this.f177974l.setText("继续划卡");
        } else if (TextUtils.equals(this.f177976n, "from_message_tag_guide")) {
            this.f177973k.setText("恭喜你成功添加了标签，快和对方聊聊吧～");
            this.f177974l.setText("去聊天");
        }
        xdl0.m208329E0(this.f177974l, new View.OnClickListener() { // from class: l.ssh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166216a.m195201I(view);
            }
        });
        xdl0.m208329E0(this.f177975m, new View.OnClickListener() { // from class: l.tsh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171940a.m195202J(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m195201I(View view) {
        dismiss();
        zvf0.m220399u("e_tag_confirmation", "p_love_signal_guide_tag", vwb.m200311Y("click_options", Integer.valueOf(TextUtils.equals(this.f177976n, "from_card_tag_guide") ? 2 : 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m195202J(View view) {
        sa40.m182802o().m182805C(this.f177977o, "e_card_add_tag", false);
        dismiss();
        zvf0.m220399u("e_tag_confirmation", "p_love_signal_guide_tag", vwb.m200311Y("click_options", 3));
    }

    /* JADX INFO: renamed from: G */
    public View m195203G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vsh0.m199871b(this, layoutInflater, viewGroup);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m195203G(this.f177977o.getLayoutInflater(), null));
        m195200H();
        setCancelable(false);
    }

    @Override // p149l.szd, android.app.Dialog
    public void show() {
        super.show();
        zvf0.m220402x("e_tag_confirmation", "p_love_signal_guide_tag");
    }
}
