package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import l.j760;
import l.sa40;
import l.szd;
import l.v7c0;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ush0 extends szd {

    /* JADX INFO: renamed from: j */
    public TextView f7813j;

    /* JADX INFO: renamed from: k */
    public TextView f7814k;

    /* JADX INFO: renamed from: l */
    public TextView f7815l;

    /* JADX INFO: renamed from: m */
    public TextView f7816m;

    /* JADX INFO: renamed from: n */
    public final String f7817n;

    /* JADX INFO: renamed from: o */
    public final Act f7818o;

    public ush0(Act act, String str) {
        super(act, false, v7c0.p);
        this.f7817n = str;
        this.f7818o = act;
    }

    /* JADX INFO: renamed from: H */
    private void m9775H() {
        if (TextUtils.equals(this.f7817n, "from_heartbeat")) {
            this.f7814k.setText("恭喜你成功添加了标签，已开启本次心动信号！");
            this.f7815l.setText("去聊天");
        } else if (TextUtils.equals(this.f7817n, "from_card_tag_guide")) {
            this.f7814k.setText("恭喜你成功添加了标签，将会加大曝光为你寻找更合适的人！");
            this.f7815l.setText("继续划卡");
        } else if (TextUtils.equals(this.f7817n, "from_message_tag_guide")) {
            this.f7814k.setText("恭喜你成功添加了标签，快和对方聊聊吧～");
            this.f7815l.setText("去聊天");
        }
        xdl0.E0(this.f7815l, new View.OnClickListener() { // from class: l.ssh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7458a.m9776I(view);
            }
        });
        xdl0.E0(this.f7816m, new View.OnClickListener() { // from class: l.tsh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7620a.m9777J(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m9776I(View view) {
        dismiss();
        zvf0.u("e_tag_confirmation", "p_love_signal_guide_tag", new j760[]{vwb.Y("click_options", Integer.valueOf(TextUtils.equals(this.f7817n, "from_card_tag_guide") ? 2 : 1))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m9777J(View view) {
        sa40.o().C(this.f7818o, "e_card_add_tag", false);
        dismiss();
        zvf0.u("e_tag_confirmation", "p_love_signal_guide_tag", new j760[]{vwb.Y("click_options", 3)});
    }

    /* JADX INFO: renamed from: G */
    public View m9778G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vsh0.m10344b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(m9778G(this.f7818o.getLayoutInflater(), null));
        m9775H();
        setCancelable(false);
    }

    public void show() {
        super.show();
        zvf0.x("e_tag_confirmation", "p_love_signal_guide_tag");
    }
}
