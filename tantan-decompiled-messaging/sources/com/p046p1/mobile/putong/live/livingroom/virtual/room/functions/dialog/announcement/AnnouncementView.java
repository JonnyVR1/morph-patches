package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceAnnouncementDialogViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement.AnnouncementView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.cxq;
import p149l.h1c0;
import p149l.h4t;
import p149l.j7n0;
import p149l.kvc0;
import p149l.os0;
import p149l.osi0;
import p149l.url;
import p149l.w7n0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0005*\u0001\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceAnnouncementDialogViewBindings;", "Ll/os0;", "Ll/url;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/j7n0;", OMSTemplateType.dialog, "", "a", "(Ll/j7n0;)V", "c", "()V", "com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView$a", "e", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView$a;", "textWatcher", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class AnnouncementView extends LiveVirtualVoiceAnnouncementDialogViewBindings<os0> implements url {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C12972a textWatcher;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement.AnnouncementView$a */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12972a implements TextWatcher {
        public C12972a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            if (s.length() > 0 && s.length() > 1000) {
                osi0.m165782f(R$string.f46576Aj);
                AnnouncementView.this.f48091c.setText(s.subSequence(0, 1000).toString());
                EditText editText = AnnouncementView.this.f48091c;
                editText.setSelection(editText.getText().length());
            }
            AnnouncementView.this.f48092d.setSelected(s.length() > 0);
            boolean zIsSelected = AnnouncementView.this.f48092d.isSelected();
            AnnouncementView announcementView = AnnouncementView.this;
            if (zIsSelected) {
                announcementView.f48092d.setTextColor(kvc0.m147352a(h1c0.f105416w1));
            } else {
                announcementView.f48092d.setTextColor(kvc0.m147352a(h1c0.f105386m1));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            s.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnouncementView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.textWatcher = new C12972a();
    }

    /* JADX INFO: renamed from: i */
    public static Unit m77326i(AnnouncementView announcementView, View view) {
        view.getClass();
        String string = announcementView.f48091c.getText().toString();
        if (!StringsKt.m93438e0(string)) {
            T t = announcementView.f48089a;
            t.getClass();
            w7n0.m202027d((h4t) t, VirtualVoiceMotionType.announcement);
            ((os0) announcementView.f48089a).m165692P3(string);
        }
        return Unit.INSTANCE;
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: a */
    public void mo77327a(@NotNull j7n0 dialog) {
        dialog.getClass();
        VText vText = this.f48092d;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.qs0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnnouncementView.m77326i(this.f156083a, (View) obj);
            }
        });
        if (!TextUtils.isEmpty(((os0) this.f48089a).m165695V3())) {
            this.f48091c.setText(((os0) this.f48089a).m165695V3());
            this.f48091c.setSelection(((os0) this.f48089a).m165695V3().length());
        }
        this.f48091c.addTextChangedListener(this.textWatcher);
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo77328b(boolean z) {
        super.mo77328b(z);
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: c */
    public void mo77329c() {
        this.f48091c.removeTextChangedListener(this.textWatcher);
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: d */
    public /* bridge */ void mo77330d() {
        super.mo77330d();
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: e */
    public /* bridge */ void mo77331e() {
        super.mo77331e();
    }
}
