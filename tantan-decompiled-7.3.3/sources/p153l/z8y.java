package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MyMeetEntryNearby;
import com.p051p1.mobile.putong.core.newui.meet.MeetAct;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010$¨\u0006&"}, m88121d2 = {"Ll/z8y;", "Ll/bzl;", "<init>", "()V", "Ll/j8y;", "meetEntranceData", "", "acceleratePairStrategyEnable", "b", "(Ll/j8y;Z)Z", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "getAvatar", "()Lcom/p1/mobile/putong/data/Picture$ImageUri;", "c", "()Z", "", "f", "()I", "", "getTitle", "()Ljava/lang/CharSequence;", "g", "Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;", "viewModel", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "_view", "", "a", "(Lcom/p1/mobile/putong/core/newui/messages/business/meet/MeetEntranceModel;Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;", "Lcom/p1/mobile/putong/core/data/MyMeetEntryNearby;", "nearby", "Lcom/p1/mobile/putong/data/User;", "Lcom/p1/mobile/putong/data/User;", "nearbyUser", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class z8y implements bzl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public MyMeetEntryNearby nearby;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public User nearbyUser;

    /* JADX INFO: renamed from: h */
    public static void m219036h(z8y z8yVar, BusinessConversationView businessConversationView, View view) {
        i4g0.m138523u("e_red_dot_message_see", OMSDialogPositon.p_messages_view, jyb.m147494Y("guidance_type", z8yVar.mo107170d()));
        businessConversationView.getContext().startActivity(MeetAct.m41505Z1(businessConversationView.getContext(), "", "nearby"));
        CoreModule.f18264c.f20406m1.m35700L5();
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: a */
    public void mo107167a(@NotNull MeetEntranceModel viewModel, @NotNull final BusinessConversationView _view) {
        viewModel.getClass();
        _view.getClass();
        bnl0.m105524M(_view.f26477i, false);
        bnl0.m105558h0(_view.f26476h, qa00.m175859d(7.0f));
        _view.f26476h.setBackgroundResource(dbc0.f86631Ue);
        boolean zM131778z = gra.m131778z();
        VImage vImage = _view.f26489u;
        if (zM131778z) {
            vImage.setImageResource(dbc0.f86569Sg);
        } else {
            vImage.setImageResource(dbc0.f86791Ze);
        }
        bnl0.m105524M(_view.f26489u, true);
        boolean zM35718i4 = CoreModule.f18264c.f20406m1.m35718i4();
        VText vText = _view.f26494z;
        if (zM35718i4) {
            ViewGroup.LayoutParams layoutParams = vText.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int i = qa00.f156323j;
                marginLayoutParams.width = i;
                marginLayoutParams.height = i;
                marginLayoutParams.topMargin = qa00.f156316c;
                _view.f26494z.setLayoutParams(marginLayoutParams);
            }
            _view.f26494z.setMinWidth(qa00.f156323j);
            _view.f26494z.setText("");
            _view.f26494z.setBackgroundResource(dbc0.f86750Y5);
            bnl0.m105524M(_view.f26494z, true);
        } else {
            bnl0.m105524M(vText, false);
        }
        bnl0.m105524M(_view.f26471A, false);
        bnl0.m105509E0(_view, new View.OnClickListener() { // from class: l.y8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z8y.m219036h(this.f198053a, _view, view);
            }
        });
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: b */
    public boolean mo107168b(@NotNull j8y meetEntranceData, boolean acceleratePairStrategyEnable) {
        List<String> list;
        meetEntranceData.getClass();
        MyMeetEntryNearby nearby = meetEntranceData.getNearby();
        if (nearby != null && (list = nearby.userIds) != null && (!list.isEmpty())) {
            MyMeetEntryNearby nearby2 = meetEntranceData.getNearby();
            nearby2.getClass();
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(nearby2.userIds.get(0));
            if (userM116503Pa != null) {
                this.nearbyUser = userM116503Pa;
                this.nearby = meetEntranceData.getNearby();
                return true;
            }
        }
        return false;
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: c */
    public boolean mo107169c() {
        return (joa.m146361M3() || this.nearbyUser == null) ? false : true;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo107170d() {
        return "nearby";
    }

    @Override // p153l.bzl
    /* JADX INFO: renamed from: f */
    public int mo107172f() {
        return 0;
    }

    @Override // p153l.bzl
    @NotNull
    /* JADX INFO: renamed from: g */
    public CharSequence mo107173g() {
        String str;
        MyMeetEntryNearby myMeetEntryNearby = this.nearby;
        if (TextUtils.isEmpty(myMeetEntryNearby != null ? myMeetEntryNearby.subText : null)) {
            return "其中有人正在找人聊天，快去看看吧";
        }
        MyMeetEntryNearby myMeetEntryNearby2 = this.nearby;
        return (myMeetEntryNearby2 == null || (str = myMeetEntryNearby2.subText) == null) ? "" : str;
    }

    @Override // p153l.bzl
    @Nullable
    public Picture.ImageUri getAvatar() {
        Picture pictureM61308fp;
        User user = this.nearbyUser;
        if (user == null || (pictureM61308fp = user.m61308fp()) == null) {
            return null;
        }
        return pictureM61308fp.profileSmall();
    }

    @Override // p153l.bzl
    @NotNull
    public CharSequence getTitle() {
        User user = this.nearbyUser;
        return "为你找到了附近在线的".concat((user == null || !user.isFemale()) ? "他" : "她");
    }
}
