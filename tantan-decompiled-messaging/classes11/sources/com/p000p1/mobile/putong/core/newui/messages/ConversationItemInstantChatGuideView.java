package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.match.b;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c40;
import l.d30;
import l.jjb0;
import l.k96;
import l.qib0;
import l.t100;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemInstantChatGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3599a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f3600b;

    /* JADX INFO: renamed from: c */
    public VText f3601c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f3602d;

    /* JADX INFO: renamed from: e */
    public VImage f3603e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f3604f;

    /* JADX INFO: renamed from: g */
    public VText f3605g;

    /* JADX INFO: renamed from: h */
    public VImage f3606h;

    /* JADX INFO: renamed from: i */
    public Act f3607i;

    /* JADX INFO: renamed from: j */
    public Conversation f3608j;

    /* JADX INFO: renamed from: k */
    public User f3609k;

    /* JADX INFO: renamed from: l */
    public Long f3610l;

    /* JADX INFO: renamed from: m */
    public c40 f3611m;

    public class ShaderBLToTRSpan extends ForegroundColorSpan {

        @NonNull
        @ColorInt
        int[] colors;
        float[] positions;
        String value;

        public ShaderBLToTRSpan(int i, @NonNull @ColorInt String str, int[] iArr, float[] fArr) {
            super(i);
            this.value = str;
            this.colors = iArr;
            this.positions = fArr;
        }

        @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            float fMeasureText = textPaint.measureText(this.value);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f = t100.j;
            if (NullChecker.a(fontMetrics)) {
                f = fontMetrics.descent - fontMetrics.ascent;
            }
            textPaint.setShader(new LinearGradient(0.0f, f, fMeasureText, 0.0f, this.colors, this.positions, Shader.TileMode.CLAMP));
        }
    }

    public ConversationItemInstantChatGuideView(Context context) {
        super(context);
        this.f3610l = 0L;
    }

    /* JADX INFO: renamed from: f */
    public final void m4929f(View view) {
        k96.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m4930g(boolean z) {
        if (this.f3609k.isFemale()) {
            return z ? "她最近看过你" : "你喜欢了她";
        }
        return z ? "他最近看过你" : "你喜欢了他";
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m4931h() {
        CoreModule.c.C2.o3(((DbObject) this.f3609k).id, false);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m4932i(View view) {
        if (NullChecker.a(this.f3609k)) {
            zvf0.r("e_odiamond_locked_match", "p_messages_view");
        }
        b.o(this.f3607i, this.f3609k, "p_messages,odiamond_sayhi", new d30() { // from class: l.h96
            public final void call() {
                this.f13911a.m4931h();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m4933j(View view) {
        this.f3611m.b();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m4934k(VListCell vListCell, VListCell.a aVar, int i) {
        this.f3611m.b();
        if (NullChecker.a(this.f3609k)) {
            CoreModule.c.C2.o3(((DbObject) this.f3609k).id, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m4935l(View view) {
        c40.b bVar = new c40.b(this.f3607i);
        ArrayList arrayList = new ArrayList();
        arrayList.add("删除");
        c40 c40VarF = bVar.I(this.f3607i.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.i96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14444a.m4933j(view2);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.j96
            /* JADX INFO: renamed from: a */
            public final void m16915a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f15004a.m4934k(vListCell, aVar, i);
            }
        }).F();
        this.f3611m = c40VarF;
        c40VarF.f();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m4936m(Act act, Conversation conversation) {
        this.f3607i = act;
        this.f3608j = conversation;
        User userById = CoreModule.K().getUserById(conversation.otherUser);
        this.f3609k = userById;
        if (userById == null) {
            return;
        }
        m4939p();
        m4942s();
        m4941r();
    }

    /* JADX INFO: renamed from: n */
    public final void m4937n(boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String strM4930g = m4930g(z);
        spannableStringBuilder.append((CharSequence) strM4930g);
        int length = strM4930g.length();
        spannableStringBuilder.setSpan(new ShaderBLToTRSpan(Color.parseColor("#9F6820"), strM4930g, new int[]{Color.parseColor("#9F6820"), Color.parseColor("#C58D32"), Color.parseColor("#9F6820")}, new float[]{0.2f, 0.5f, 0.8f}), 0, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, length, 33);
        spannableStringBuilder.append((CharSequence) " · ");
        int i = length + 3;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#C28B31")), length, i, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, i, 33);
        spannableStringBuilder.append((CharSequence) "点击按钮马上配对");
        this.f3605g.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o */
    public final void m4938o() {
        boolean zIsPicVerificationVerified = this.f3609k.isPicVerificationVerified();
        VImage vImage = this.f3603e;
        if (zIsPicVerificationVerified) {
            vImage.setBackgroundResource(x2c0.kj);
            xdl0.M(this.f3603e, true);
        } else {
            xdl0.M(vImage, false);
        }
        if (jjb0.b()) {
            qib0.b0.b.showUserVerificationLogo(getContext(), this.f3609k, this.f3603e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4929f(this);
        this.f3601c.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: p */
    public final void m4939p() {
        qib0.G.L0(this.f3599a, this.f3609k.fp().profileSmall().formatted());
        this.f3601c.setText(this.f3609k.name);
        m4938o();
        m4940q(CoreModule.c.C2.x3(this.f3608j));
        xdl0.M(this.f3602d, this.f3603e.getVisibility() == 0 || this.f3604f.getVisibility() == 0);
        m4937n(CoreModule.c.C2.x3(this.f3608j));
    }

    /* JADX INFO: renamed from: q */
    public final void m4940q(boolean z) {
        Settings settings;
        List list;
        int i = 0;
        xdl0.M(this.f3604f, false);
        if (!z || (settings = this.f3609k.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || settings.settingGroups.get(0) == null || ((SettingGroups) settings.settingGroups.get(0)).live == null) {
            return;
        }
        switch (((SettingGroups) settings.settingGroups.get(0)).live.wealthGrade) {
            case 30:
                i = x2c0.M5;
                break;
            case 31:
                i = x2c0.N5;
                break;
            case 32:
                i = x2c0.O5;
                break;
            case 33:
                i = x2c0.P5;
                break;
            case 34:
                i = x2c0.Q5;
                break;
            case 35:
                i = x2c0.R5;
                break;
        }
        if (i != 0) {
            xdl0.M(this.f3604f, true);
            qib0.G.Y0(this.f3604f, i);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m4941r() {
        if (System.currentTimeMillis() - this.f3610l.longValue() <= 300) {
            return;
        }
        this.f3610l = Long.valueOf(System.currentTimeMillis());
        if (NullChecker.a(this.f3609k)) {
            zvf0.x("e_odiamond_locked_match", "p_messages_view");
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m4942s() {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.f96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12878a.m4932i(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.g96
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f13382a.m4935l(view);
            }
        });
    }

    public ConversationItemInstantChatGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3610l = 0L;
    }

    public ConversationItemInstantChatGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3610l = 0L;
    }

    public ConversationItemInstantChatGuideView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3610l = 0L;
    }
}
