package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopEditInfo;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditActionView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.navigationbar.VNavigationBar;
import p149l.cfa0;
import p149l.e30;
import p149l.e3c0;
import p149l.e51;
import p149l.lsi0;
import p149l.t100;
import p149l.xdl0;
import p149l.yha0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopCreateTagAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f33503c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopEditActionView f33504d;

    /* JADX INFO: renamed from: e */
    public VButton f33505e;

    /* JADX INFO: renamed from: f */
    public LoopEditInfo f33506f;

    /* JADX INFO: renamed from: b2 */
    public static Intent m51638b2(LoopEditInfo loopEditInfo, Context context) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopCreateTagAct.class);
        intent.putExtra("loop_create_tag_info", loopEditInfo);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m51639d2(Bundle bundle) {
        m51642r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m51640e2(View view) {
        m51644c2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m51641h2() {
        this.f33504d.f34171e.requestFocus();
        act().showInput(this.f33504d.f34171e, 0);
    }

    /* JADX INFO: renamed from: r */
    private void m51642r() {
        xdl0.m208329E0(this.f33505e, new View.OnClickListener() { // from class: l.zea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202792a.m51640e2(view);
            }
        });
        if (NullChecker.m81303a(this.f33506f) && !this.f33506f.couldInputEmpty && TextUtils.isEmpty(this.f33504d.getInputValue())) {
            this.f33505e.setEnabled(false);
            this.f33505e.setClickable(false);
            this.f33505e.setBackground(getResources().getDrawable(e3c0.f89143r1));
        }
        this.f33503c.setLeftIconAsBack(this);
        this.f33504d.setInputTextChangeListener(new ProfileLoopEditActionView.InterfaceC8746b() { // from class: l.afa0
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditActionView.InterfaceC8746b
            /* JADX INFO: renamed from: a */
            public final void mo52978a(String str, String str2) {
                this.f69162a.m51645g2(str, str2);
            }
        });
        this.f33504d.m52973c(this.f33506f);
        xdl0.m208345M0(this.f33504d.f34167a, true);
        this.f33504d.f34167a.setText(this.f33506f.title);
        if (this.f33504d.f34170d.getVisibility() == 0) {
            xdl0.m208325C0(this.f33504d.f34169c, t100.m186890d(200.0f));
        }
        e51.m114743H(this, new Runnable() { // from class: l.bfa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f75287a.m51641h2();
            }
        }, 300L);
        xdl0.m208344M(this.f33504d.f34174h, false);
    }

    /* JADX INFO: renamed from: a2 */
    public View m51643a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cfa0.m106488b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c2 */
    public final void m51644c2() {
        String inputValue = this.f33504d.getInputValue();
        if (yha0.m214797b(inputValue)) {
            lsi0.m151595y(CoreModule.f17544b.getString(R$string.f27876k0));
            return;
        }
        if (!TextUtils.isEmpty(inputValue) || this.f33506f.couldInputEmpty) {
            m51646i2();
            hideInput();
            Intent intent = new Intent();
            intent.putExtra("loop_result_key", inputValue);
            intent.putExtra("loop_create_tag_info", this.f33506f);
            setResult(-1, intent);
            m50458m2();
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m51645g2(String str, String str2) {
        if (NullChecker.m81303a(this.f33505e)) {
            if (NullChecker.m81303a(this.f33506f) && TextUtils.isEmpty(str2) && this.f33506f.couldInputEmpty) {
                this.f33505e.setEnabled(true);
                this.f33505e.setClickable(true);
                this.f33505e.setBackground(getResources().getDrawable(e3c0.f89103f));
            } else if (TextUtils.isEmpty(str.trim()) || !TextUtils.isEmpty(str2)) {
                this.f33505e.setEnabled(false);
                this.f33505e.setClickable(false);
                this.f33505e.setBackground(getResources().getDrawable(e3c0.f89143r1));
            } else {
                this.f33505e.setEnabled(true);
                this.f33505e.setClickable(true);
                this.f33505e.setBackground(getResources().getDrawable(e3c0.f89103f));
            }
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m51646i2() {
        if (NullChecker.m81303a(this.f33506f) && NullChecker.m81303a(this.f33506f.loopInputType)) {
            LoopInputType loopInputType = this.f33506f.loopInputType;
            if (loopInputType == LoopInputType.QUESTION_EDIT || loopInputType == LoopInputType.QUESTION_CHOICE) {
                zvf0.m220396r("e_my_question_edit_answer_save", "p_my_question_edit_answer");
            } else if (loopInputType == LoopInputType.HANGOUTS) {
                zvf0.m220396r("e_edit_hangouts_save", "p_edit_hangouts_view");
            }
            if (this.f33506f.isHarmonyTest) {
                zvf0.m220396r("e_profile_test_question_finish", pageId());
            }
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m51643a2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f33506f = (LoopEditInfo) getIntent().getSerializableExtra("loop_create_tag_info");
        super.initDataOnCreate();
        creates(new e30() { // from class: l.yea0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197673a.m51639d2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        hideInput();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        if (NullChecker.m81303a(this.f33506f) && NullChecker.m81303a(this.f33506f.loopInputType)) {
            LoopInputType loopInputType = this.f33506f.loopInputType;
            if (loopInputType == LoopInputType.INDUSTRY) {
                return "p_edit_custom_industry_view";
            }
            if (loopInputType == LoopInputType.DEPARTMENT) {
                return "p_edit_custom_work_area_view";
            }
            if (loopInputType == LoopInputType.HOMETOWN) {
                return "p_edit_custom_hometown_view";
            }
            if (loopInputType == LoopInputType.QUESTION_EDIT || loopInputType == LoopInputType.QUESTION_CHOICE) {
                return "p_my_question_edit_answer";
            }
            if (loopInputType == LoopInputType.HANGOUTS) {
                return "p_edit_hangouts_view";
            }
        }
        return super.pageId();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134126m();
        }
    }
}
