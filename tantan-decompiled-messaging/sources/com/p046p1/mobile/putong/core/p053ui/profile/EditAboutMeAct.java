package com.p046p1.mobile.putong.core.p053ui.profile;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VMaterialEdit;
import p147v.VText;
import p149l.e30;
import p149l.h7c0;
import p149l.mkd0;
import p149l.pje;
import p149l.u4c0;
import p149l.vwb;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class EditAboutMeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VMaterialEdit f32937c;

    /* JADX INFO: renamed from: d */
    public VText f32938d;

    /* JADX INFO: renamed from: e */
    public VText f32939e;

    /* JADX INFO: renamed from: f */
    public VText f32940f;

    /* JADX INFO: renamed from: g */
    public MenuItem f32941g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.EditAboutMeAct$a */
    public class C8620a implements TextWatcher {
        public C8620a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EditAboutMeAct.this.f32937c.setError(yij0.f198513j.call(editable));
            EditAboutMeAct.this.m50577m2();
            EditAboutMeAct.this.m50576l2();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m50570e2(Context context, String str) {
        return new Intent(context, (Class<?>) EditAboutMeAct.class).putExtra("about_me", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m50571g2(View view) {
        zvf0.m220399u("e_about_me_flash_fill_button", pageId(), vwb.m200311Y("text_code", (String) view.getTag()));
        this.f32937c.getEditableText().append((CharSequence) SignParameters.NEW_LINE).append(((VText) view).getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m50572h2() {
        this.f32937c.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m50573i2(User user) {
        LookingFor lookingFor = user.settings.getLookingFor();
        if (TEnum.equals(lookingFor, "female")) {
            this.f32938d.setText(R$string.f18949tk);
            this.f32938d.setTag("for_women_1");
            this.f32939e.setText(R$string.f18979uk);
            this.f32939e.setTag("for_women_2");
            this.f32940f.setText(R$string.f19009vk);
            this.f32940f.setTag("for_women_3");
        } else {
            boolean zEquals = TEnum.equals(lookingFor, "male");
            VText vText = this.f32938d;
            if (zEquals) {
                vText.setText(R$string.f18859qk);
                this.f32938d.setTag("for_men_1");
                this.f32939e.setText(R$string.f18889rk);
                this.f32939e.setTag("for_men_2");
                this.f32940f.setText(R$string.f18919sk);
                this.f32940f.setTag("for_men_3");
            } else {
                vText.setText(R$string.f18798ok);
                this.f32938d.setTag("for_both_1");
                this.f32939e.setText(R$string.f18829pk);
                this.f32939e.setTag("for_both_2");
                this.f32940f.setVisibility(8);
            }
        }
        m50577m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$2(Bundle bundle) {
        this.f32937c.setText(getIntent().getStringExtra("about_me"));
        VMaterialEdit vMaterialEdit = this.f32937c;
        vMaterialEdit.setSelection(vMaterialEdit.getText().length());
        this.f32937c.post(new Runnable() { // from class: l.oje
            @Override // java.lang.Runnable
            public final void run() {
                this.f144268a.m50572h2();
            }
        });
        VMaterialEdit vMaterialEdit2 = this.f32937c;
        vMaterialEdit2.setError(yij0.f198513j.call(vMaterialEdit2.getText()));
        m50576l2();
        this.f32937c.addTextChangedListener(new C8620a());
    }

    /* JADX INFO: renamed from: d2 */
    public View m50574d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pje.m169841b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM50574d2 = m50574d2(layoutInflater, viewGroup);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.mje
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134120a.m50571g2(view);
            }
        };
        this.f32938d.setOnClickListener(onClickListener);
        this.f32939e.setOnClickListener(onClickListener);
        this.f32940f.setOnClickListener(onClickListener);
        return viewM50574d2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.kje
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123445a.lambda$initSubscription$2((Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).subscribe(mkd0.m154955G(new e30() { // from class: l.lje
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128306a.m50573i2((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m50575k2(VText vText) {
        if (vText.getText().length() + this.f32937c.getText().length() + 1 <= 500) {
            vText.setEnabled(true);
        } else {
            vText.setEnabled(false);
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final void m50576l2() {
        if (NullChecker.m81303a(this.f32941g)) {
            this.f32941g.setEnabled(TextUtils.isEmpty(this.f32937c.getError()));
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final void m50577m2() {
        vwb.m200354z(vwb.m200324f0(this.f32938d, this.f32939e, this.f32940f), new e30() { // from class: l.nje
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139229a.m50575k2((VText) obj);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CoreBusinessModule.m29908m0().mo190514a(act());
        getMenuInflater().inflate(h7c0.f106220b, menu);
        this.f32941g = menu.findItem(u4c0.f174206d3);
        m50576l2();
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != u4c0.f174206d3) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        intent.putExtra("about_me", this.f32937c.getText().toString());
        act().setResult(-1, intent);
        m66873d2();
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_edit_self_introduction_view";
    }
}
