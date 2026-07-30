package com.p051p1.mobile.putong.core.p058ui.profile;

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
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VMaterialEdit;
import p151v.VText;
import p153l.adc0;
import p153l.bsj0;
import p153l.i4g0;
import p153l.jyb;
import p153l.lfc0;
import p153l.psd0;
import p153l.tke;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class EditAboutMeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VMaterialEdit f33785c;

    /* JADX INFO: renamed from: d */
    public VText f33786d;

    /* JADX INFO: renamed from: e */
    public VText f33787e;

    /* JADX INFO: renamed from: f */
    public VText f33788f;

    /* JADX INFO: renamed from: g */
    public MenuItem f33789g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.EditAboutMeAct$a */
    public class C8783a implements TextWatcher {
        public C8783a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditAboutMeAct.this.f33785c.setError(bsj0.f78170j.call(editable));
            EditAboutMeAct.this.m51760n2();
            EditAboutMeAct.this.m51759m2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m51753g2(Context context, String str) {
        return new Intent(context, (Class<?>) EditAboutMeAct.class).putExtra("about_me", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m51754h2(View view) {
        i4g0.m138523u("e_about_me_flash_fill_button", pageId(), jyb.m147494Y("text_code", (String) view.getTag()));
        this.f33785c.getEditableText().append((CharSequence) SignParameters.NEW_LINE).append(((VText) view).getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m51755i2() {
        this.f33785c.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m51756k2(User user) {
        LookingFor lookingFor = user.settings.getLookingFor();
        if (TEnum.equals(lookingFor, "female")) {
            this.f33786d.setText(R$string.f18767Pk);
            this.f33786d.setTag("for_women_1");
            this.f33787e.setText(R$string.f18797Qk);
            this.f33787e.setTag("for_women_2");
            this.f33788f.setText(R$string.f18827Rk);
            this.f33788f.setTag("for_women_3");
        } else {
            boolean zEquals = TEnum.equals(lookingFor, "male");
            VText vText = this.f33786d;
            if (zEquals) {
                vText.setText(R$string.f18677Mk);
                this.f33786d.setTag("for_men_1");
                this.f33787e.setText(R$string.f18707Nk);
                this.f33787e.setTag("for_men_2");
                this.f33788f.setText(R$string.f18737Ok);
                this.f33788f.setTag("for_men_3");
            } else {
                vText.setText(R$string.f18616Kk);
                this.f33786d.setTag("for_both_1");
                this.f33787e.setText(R$string.f18647Lk);
                this.f33787e.setTag("for_both_2");
                this.f33788f.setVisibility(8);
            }
        }
        m51760n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        this.f33785c.setText(getIntent().getStringExtra("about_me"));
        VMaterialEdit vMaterialEdit = this.f33785c;
        vMaterialEdit.setSelection(vMaterialEdit.getText().length());
        this.f33785c.post(new Runnable() { // from class: l.ske
            @Override // java.lang.Runnable
            public final void run() {
                this.f169250a.m51755i2();
            }
        });
        VMaterialEdit vMaterialEdit2 = this.f33785c;
        vMaterialEdit2.setError(bsj0.f78170j.call(vMaterialEdit2.getText()));
        m51759m2();
        this.f33785c.addTextChangedListener(new C8783a());
    }

    /* JADX INFO: renamed from: e2 */
    public View m51757e2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tke.m191545b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM51757e2 = m51757e2(layoutInflater, viewGroup);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.qke
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158124a.m51754h2(view);
            }
        };
        this.f33786d.setOnClickListener(onClickListener);
        this.f33787e.setOnClickListener(onClickListener);
        this.f33788f.setOnClickListener(onClickListener);
        return viewM51757e2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.oke
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147749a.lambda$initSubscription$2((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).subscribe(psd0.m173596G(new y20() { // from class: l.pke
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152827a.m51756k2((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m51758l2(VText vText) {
        if (vText.getText().length() + this.f33785c.getText().length() + 1 <= 500) {
            vText.setEnabled(true);
        } else {
            vText.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final void m51759m2() {
        if (NullChecker.m82486a(this.f33789g)) {
            this.f33789g.setEnabled(TextUtils.isEmpty(this.f33785c.getError()));
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final void m51760n2() {
        jyb.m147537z(jyb.m147507f0(this.f33786d, this.f33787e, this.f33788f), new y20() { // from class: l.rke
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163560a.m51758l2((VText) obj);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CoreBusinessModule.m30906m0().mo122541a(act());
        getMenuInflater().inflate(lfc0.f131839b, menu);
        this.f33789g = menu.findItem(adc0.f70331f3);
        m51759m2();
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != adc0.f70331f3) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        intent.putExtra("about_me", this.f33785c.getText().toString());
        act().setResult(-1, intent);
        m68056e2();
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_edit_self_introduction_view";
    }
}
