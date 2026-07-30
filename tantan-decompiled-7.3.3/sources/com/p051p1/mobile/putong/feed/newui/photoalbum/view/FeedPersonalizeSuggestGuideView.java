package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserPrivacySettings;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedPersonalizeSuggestGuideView;
import p151v.VText;
import p153l.bnl0;
import p153l.cmg;
import p153l.i4g0;
import p153l.mrb0;
import p153l.psd0;
import p153l.r1j0;
import p153l.uxj0;
import p153l.xkh;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPersonalizeSuggestGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedPersonalizeSuggestGuideView f43289a;

    /* JADX INFO: renamed from: b */
    public VText f43290b;

    /* JADX INFO: renamed from: c */
    public VText f43291c;

    /* JADX INFO: renamed from: d */
    public VText f43292d;

    /* JADX INFO: renamed from: e */
    public boolean f43293e;

    public FeedPersonalizeSuggestGuideView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m66354d(Throwable th) {
    }

    private String getPageId() {
        return cmg.m111233s() ? "p_discover_dating" : OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: e */
    public final void m66355e(View view) {
        xkh.m211399a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m66356f(User user) {
        if (user.settings.getSettingGroup().privacy.personalizeSuggest.booleanValue()) {
            bnl0.m105524M(this.f43289a, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m66357g(uxj0 uxj0Var) {
        bnl0.m105524M(this.f43289a, false);
        r1j0.m179420g("个性化推荐已开启");
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m66358h(View view) {
        i4g0.m138520r("e_personality_switch", getPageId());
        SettingGroups settingGroups = new SettingGroups();
        UserPrivacySettings userPrivacySettings = new UserPrivacySettings();
        settingGroups.privacy = userPrivacySettings;
        userPrivacySettings.personalizeSuggest = Boolean.TRUE;
        FeedModule.m61406H().patchSettings(settingGroups.subtract(mrb0.m159625C().settings.getSettingGroup())).subscribe(psd0.m173597H(new y20() { // from class: l.vkh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184485a.m66357g((uxj0) obj);
            }
        }, new y20() { // from class: l.wkh
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedPersonalizeSuggestGuideView.m66354d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public void m66359i(Act act) {
        if (!this.f43293e) {
            this.f43293e = true;
            i4g0.m138526x("e_personality_banner", getPageId());
        }
        act.duringCreated(mrb0.m159624B()).subscribe(psd0.m173596G(new y20() { // from class: l.tkh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f174713a.m66356f((User) obj);
            }
        }));
        bnl0.m105509E0(this.f43292d, new View.OnClickListener() { // from class: l.ukh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179413a.m66358h(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66355e(this);
        this.f43290b.setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(bnl0.m105592y0(), 1073741824), i2);
    }

    public FeedPersonalizeSuggestGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPersonalizeSuggestGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FeedPersonalizeSuggestGuideView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
