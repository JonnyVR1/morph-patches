package com.p000p1.mobile.putong.core.p001ui.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.h7c0;
import l.j760;
import l.mkd0;
import l.pje;
import l.u4c0;
import l.vwb;
import l.yij0;
import l.zvf0;
import v.VMaterialEdit;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class EditAboutMeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VMaterialEdit f759c;

    /* JADX INFO: renamed from: d */
    public VText f760d;

    /* JADX INFO: renamed from: e */
    public VText f761e;

    /* JADX INFO: renamed from: f */
    public VText f762f;

    /* JADX INFO: renamed from: g */
    public MenuItem f763g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.EditAboutMeAct$a */
    public class C0045a implements TextWatcher {
        public C0045a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditAboutMeAct.this.f759c.setError((CharSequence) yij0.j.call(editable));
            EditAboutMeAct.this.m1012m2();
            EditAboutMeAct.this.m1011l2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m1005e2(Context context, String str) {
        return new Intent(context, (Class<?>) EditAboutMeAct.class).putExtra("about_me", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m1006g2(View view) {
        zvf0.u("e_about_me_flash_fill_button", pageId(), new j760[]{vwb.Y("text_code", (String) view.getTag())});
        this.f759c.getEditableText().append((CharSequence) "\n").append(((VText) view).getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m1007h2() {
        this.f759c.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m1008i2(User user) {
        LookingFor lookingFor = user.settings.getLookingFor();
        if (TEnum.equals(lookingFor, "female")) {
            this.f760d.setText(R.string.tk);
            this.f760d.setTag("for_women_1");
            this.f761e.setText(R.string.uk);
            this.f761e.setTag("for_women_2");
            this.f762f.setText(R.string.vk);
            this.f762f.setTag("for_women_3");
        } else {
            boolean zEquals = TEnum.equals(lookingFor, "male");
            VText vText = this.f760d;
            if (zEquals) {
                vText.setText(R.string.qk);
                this.f760d.setTag("for_men_1");
                this.f761e.setText(R.string.rk);
                this.f761e.setTag("for_men_2");
                this.f762f.setText(R.string.sk);
                this.f762f.setTag("for_men_3");
            } else {
                vText.setText(R.string.ok);
                this.f760d.setTag("for_both_1");
                this.f761e.setText(R.string.pk);
                this.f761e.setTag("for_both_2");
                this.f762f.setVisibility(8);
            }
        }
        m1012m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        this.f759c.setText(getIntent().getStringExtra("about_me"));
        VMaterialEdit vMaterialEdit = this.f759c;
        vMaterialEdit.setSelection(vMaterialEdit.getText().length());
        this.f759c.post(new Runnable() { // from class: l.oje
            @Override // java.lang.Runnable
            public final void run() {
                this.f16647a.m1007h2();
            }
        });
        VMaterialEdit vMaterialEdit2 = this.f759c;
        vMaterialEdit2.setError((CharSequence) yij0.j.call(vMaterialEdit2.getText()));
        m1011l2();
        this.f759c.addTextChangedListener(new C0045a());
    }

    /* JADX INFO: renamed from: d2 */
    public View m1009d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pje.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM1009d2 = m1009d2(layoutInflater, viewGroup);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.mje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15410a.m1006g2(view);
            }
        };
        this.f760d.setOnClickListener(onClickListener);
        this.f761e.setOnClickListener(onClickListener);
        this.f762f.setOnClickListener(onClickListener);
        return viewM1009d2;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.kje
            public final void call(Object obj) {
                this.f14357a.lambda$initSubscription$2((Bundle) obj);
            }
        });
        duringCreated(CoreModule.c.e0.o9()).subscribe(mkd0.G(new e30() { // from class: l.lje
            public final void call(Object obj) {
                this.f14889a.m1008i2((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m1010k2(VText vText) {
        if (vText.getText().length() + this.f759c.getText().length() + 1 <= 500) {
            vText.setEnabled(true);
        } else {
            vText.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final void m1011l2() {
        if (NullChecker.a(this.f763g)) {
            this.f763g.setEnabled(TextUtils.isEmpty(this.f759c.getError()));
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final void m1012m2() {
        vwb.z(vwb.f0(new VText[]{this.f760d, this.f761e, this.f762f}), new e30() { // from class: l.nje
            public final void call(Object obj) {
                this.f16073a.m1010k2((VText) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        super/*android.app.Activity*/.onCreateOptionsMenu(menu);
        CoreBusinessModule.m0().a(act());
        getMenuInflater().inflate(h7c0.b, menu);
        this.f763g = menu.findItem(u4c0.d3);
        m1011l2();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != u4c0.d3) {
            return super/*com.p1.mobile.android.app.Act*/.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        intent.putExtra("about_me", this.f759c.getText().toString());
        act().setResult(-1, intent);
        finish();
        return true;
    }

    public String pageId() {
        return "p_edit_self_introduction_view";
    }
}
