package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes2.dex */
public class c1i0 extends g1e {

    /* JADX INFO: renamed from: j */
    public TextView f79399j;

    /* JADX INFO: renamed from: k */
    public TextView f79400k;

    /* JADX INFO: renamed from: l */
    public TextView f79401l;

    /* JADX INFO: renamed from: m */
    public TextView f79402m;

    /* JADX INFO: renamed from: n */
    public final String f79403n;

    /* JADX INFO: renamed from: o */
    public final Act f79404o;

    public c1i0(Act act, String str) {
        super(act, false, agc0.f71130p);
        this.f79403n = str;
        this.f79404o = act;
    }

    /* JADX INFO: renamed from: H */
    private void m107612H() {
        if (TextUtils.equals(this.f79403n, "from_heartbeat")) {
            this.f79400k.setText("恭喜你成功添加了标签，已开启本次心动信号！");
            this.f79401l.setText("去聊天");
        } else if (TextUtils.equals(this.f79403n, "from_card_tag_guide")) {
            this.f79400k.setText("恭喜你成功添加了标签，将会加大曝光为你寻找更合适的人！");
            this.f79401l.setText("继续划卡");
        } else if (TextUtils.equals(this.f79403n, "from_message_tag_guide")) {
            this.f79400k.setText("恭喜你成功添加了标签，快和对方聊聊吧～");
            this.f79401l.setText("去聊天");
        }
        bnl0.m105509E0(this.f79401l, new View.OnClickListener() { // from class: l.a1i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67818a.m107613I(view);
            }
        });
        bnl0.m105509E0(this.f79402m, new View.OnClickListener() { // from class: l.b1i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74379a.m107614J(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m107613I(View view) {
        dismiss();
        i4g0.m138523u("e_tag_confirmation", "p_love_signal_guide_tag", jyb.m147494Y("click_options", Integer.valueOf(TextUtils.equals(this.f79403n, "from_card_tag_guide") ? 2 : 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m107614J(View view) {
        gj40.m130415o().m130418C(this.f79404o, "e_card_add_tag", false);
        dismiss();
        i4g0.m138523u("e_tag_confirmation", "p_love_signal_guide_tag", jyb.m147494Y("click_options", 3));
    }

    /* JADX INFO: renamed from: G */
    public View m107615G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d1i0.m113574b(this, layoutInflater, viewGroup);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m107615G(this.f79404o.getLayoutInflater(), null));
        m107612H();
        setCancelable(false);
    }

    @Override // p153l.g1e, android.app.Dialog
    public void show() {
        super.show();
        i4g0.m138526x("e_tag_confirmation", "p_love_signal_guide_tag");
    }
}
