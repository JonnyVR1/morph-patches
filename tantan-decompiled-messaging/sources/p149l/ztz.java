package p149l;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageNicknameSettingAct;
import p147v.VMaterialEdit;

/* JADX INFO: loaded from: classes3.dex */
public class ztz implements s7m<xtz> {

    /* JADX INFO: renamed from: a */
    public VMaterialEdit f204784a;

    /* JADX INFO: renamed from: b */
    public xtz f204785b;

    /* JADX INFO: renamed from: c */
    public MessageNicknameSettingAct f204786c;

    public ztz(MessageNicknameSettingAct messageNicknameSettingAct) {
        this.f204786c = messageNicknameSettingAct;
    }

    /* JADX INFO: renamed from: A3 */
    public void m220160A3(String str) {
        this.f204784a.setFloatingLabel(0);
        this.f204784a.setPrimaryColor(this.f204786c.getResources().getColor(a1c0.f67157k));
        this.f204784a.setFloatingLabelAlwaysShown(false);
        this.f204784a.setFilters(new InputFilter[]{new InputFilter.LengthFilter(15)});
        this.f204784a.requestFocus();
        this.f204784a.setText(str);
        this.f204784a.setSelection(Math.min(str.length(), 15));
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f204786c;
    }

    /* JADX INFO: renamed from: a */
    public View m220161a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return auz.m99095b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f204786c;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xtz xtzVar) {
        this.f204785b = xtzVar;
    }

    /* JADX INFO: renamed from: c */
    public boolean m220163c(Menu menu) {
        this.f204786c.getMenuInflater().inflate(j7c0.f116587c, menu);
        View actionView = menu.findItem(y4c0.f196249x0).getActionView();
        actionView.setClickable(true);
        actionView.setOnClickListener(new View.OnClickListener() { // from class: l.ytz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200036a.m220164d(view);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m220164d(View view) {
        zvf0.m220396r("e_save_nickname", "p_set_nickname");
        String string = this.f204784a.getEditableText().toString();
        if (qib0.f154711Z.m119125K(string) || (!TextUtils.isEmpty(string) && TextUtils.isEmpty(string.trim()))) {
            lsi0.m151593w(R$string.f20874U5);
        } else if (!Network.isConnected(view.getContext())) {
            lsi0.m151578h(R$string.f20719B2);
        } else {
            this.f204785b.m211051k0(string.trim());
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m220161a(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
