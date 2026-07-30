package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.greet.ItemGreetGuidePic;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.safety.IllegalPictureException;
import com.tantan.core.base.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.fo0;
import p153l.g39;
import p153l.i1y;
import p153l.i4g0;
import p153l.i6q;
import p153l.jyb;
import p153l.o1j0;
import p153l.psd0;
import p153l.qcj;
import p153l.uqb0;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGreetGuidePic extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f30283a;

    /* JADX INFO: renamed from: b */
    public TextView f30284b;

    /* JADX INFO: renamed from: c */
    public VText f30285c;

    public ItemGreetGuidePic(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m46975C(Message message) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m46977L(String str, View view) {
        m46991Q(str);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m46981v(String str, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                o1j0.m165651y("对方账号异常");
                return;
            } else if (i == 40046) {
                CoreModule.f18264c.f20384f0.m33905ap(str);
                return;
            } else {
                bsj0.m106246D(th);
                return;
            }
        }
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            if (th instanceof IllegalPictureException) {
                o1j0.m165651y("照片含有违规内容，请更换后再试");
                return;
            } else {
                bsj0.m106246D(th);
                return;
            }
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        int i2 = tantanForbidden.code;
        if (i2 == 40325 || i2 == 40339) {
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f56626o));
            return;
        }
        if (g39.m128719e(tantanForbidden)) {
            o1j0.m165651y("对方同意配对后可发送消息，请耐心等待");
        } else if (g39.m128718d(tantanForbidden)) {
            o1j0.m165651y(tantanForbidden.message);
        } else {
            bsj0.m106246D(th);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m46984F(View view) {
        i6q.m138839a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public final C22421c<bkj0<List<Media>, List<String>, String>> m46985G(final List<Media> list) {
        return (!jyb.m147479J(list) && (list.get(0) instanceof Picture) && uqb0.f180386R.m184740c()) ? uqb0.f180386R.m184739b(Uri.parse(list.get(0).url).getPath()).map(new qcj() { // from class: l.g6q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                bkj0 bkj0Var = (bkj0) obj;
                return bkj0.m104818a(list, ((Boolean) bkj0Var.f77081a).booleanValue() ? (List) bkj0Var.f77082b : null, !TextUtils.isEmpty((CharSequence) bkj0Var.f77083c) ? (String) bkj0Var.f77083c : "");
            }
        }) : C22421c.just(bkj0.m104818a(list, new ArrayList<String>() { // from class: com.p1.mobile.putong.core.ui.greet.ItemGreetGuidePic.1
        }, ""));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C22421c m46986K(String str, bkj0 bkj0Var) {
        return m46990P(str, (List) bkj0Var.f77081a, (List) bkj0Var.f77082b, (String) bkj0Var.f77083c);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ boolean m46987M(String str, int i, int i2, Intent intent) {
        if (i2 != -1 || !NullChecker.m82486a(intent)) {
            return false;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
        if (jyb.m147479J(arrayList)) {
            return true;
        }
        m46988N(str, arrayList);
        return true;
    }

    /* JADX INFO: renamed from: N */
    public void m46988N(final String str, List<Media> list) {
        act().duringCreated(new i1y(list, false).flatMap(new qcj() { // from class: l.b6q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f75202a.m46985G((List) obj);
            }
        }).observeOn(fo0.m126432a()).last().compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.c6q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                bkj0 bkj0Var = (bkj0) obj;
                return yb5.m214982K((List) bkj0Var.f77081a, "greeting", null, UploadSource.get("chat")).map(new qcj() { // from class: l.h6q
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        bkj0 bkj0Var2 = bkj0Var;
                        return bkj0.m104818a((List) obj2, (List) bkj0Var2.f77082b, (String) bkj0Var2.f77083c);
                    }
                });
            }
        }).compose(psd0.m173592C()).switchMap(new qcj() { // from class: l.d6q
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f85391a.m46986K(str, (bkj0) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.e6q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemGreetGuidePic.m46975C((Message) obj);
            }
        }, new y20() { // from class: l.f6q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemGreetGuidePic.m46981v(str, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m46989O(final String str) {
        i4g0.m138526x("e_city_cover_send_pic", act().pageId());
        this.f30283a.getPaint().setFakeBoldText(true);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.z5q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203075a.m46977L(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final C22421c<Message> m46990P(String str, List<Media> list, List<String> list2, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("picture");
        messageNew_.media = list;
        if (!jyb.m147479J(list2)) {
            messageNew_.riskTags = list2;
        }
        if (!TextUtils.isEmpty(str2)) {
            messageNew_.localExtraInfo = str2;
        }
        return CoreModule.f18264c.f20420r0.m35152u6(str, Channel.get(Channel.city_c), messageNew_, null, null);
    }

    /* JADX INFO: renamed from: Q */
    public final void m46991Q(final String str) {
        i4g0.m138520r("e_city_cover_send_pic", act().pageId());
        ((Act) getContext()).startActivityForResult(MediaPickerAct.m80102Y1(getContext(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withMinPickCount(1).showPreviewEditBtn(false).build()).withSubmitButtonTitle("发送").needClickPreview(true).withFromType(14).build()), new C4468a.a() { // from class: l.a6q
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f68746a.m46987M(str, i, i2, intent);
            }
        });
        ((Act) getContext()).overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46984F(this);
    }

    public ItemGreetGuidePic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGreetGuidePic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
