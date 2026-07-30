package com.p000p1.mobile.putong.core.p001ui.greet;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.CoreGiftPanelName;
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.p001ui.greet.ItemGreetGuidePic;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.safety.IllegalPictureException;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantan.core.base.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.e30;
import l.jo0;
import l.lsi0;
import l.lsx;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.ya5;
import l.yij0;
import l.zvf0;
import p003l.i4q;
import p003l.szb0;
import p003l.x19;
import rx.c;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ItemGreetGuidePic extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f1829a;

    /* JADX INFO: renamed from: b */
    public TextView f1830b;

    /* JADX INFO: renamed from: c */
    public VText f1831c;

    public ItemGreetGuidePic(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m3133C(Message message) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m3135L(String str, View view) {
        m3149Q(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m3139v(String str, Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            int i = ((TantanException.Client.CoreService) th).code;
            if (i == 40042 || i == 40044 || i == 40045) {
                lsi0.y("对方账号异常");
                return;
            } else if (i == 40046) {
                CoreModule.c.f0.ap(str);
                return;
            } else {
                yij0.D(th);
                return;
            }
        }
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            if (th instanceof IllegalPictureException) {
                lsi0.y("照片含有违规内容，请更换后再试");
                return;
            } else {
                yij0.D(th);
                return;
            }
        }
        TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
        int i2 = tantanForbidden.code;
        if (i2 == 40325 || i2 == 40339) {
            lsi0.y(CoreModule.b.getString(R.string.o));
            return;
        }
        if (x19.m10619e(tantanForbidden)) {
            lsi0.y("对方同意配对后可发送消息，请耐心等待");
        } else if (x19.m10618d(tantanForbidden)) {
            lsi0.y(tantanForbidden.message);
        } else {
            yij0.D(th);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3142F(View view) {
        i4q.m7127a(this, view);
    }

    /* JADX INFO: renamed from: G */
    public final c<xaj0<List<Media>, List<String>, String>> m3143G(final List<Media> list) {
        return (!vwb.J(list) && (list.get(0) instanceof Picture) && qib0.R.c()) ? qib0.R.b(Uri.parse(list.get(0).url).getPath()).map(new w9j() { // from class: l.g4q
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return xaj0.a(list, ((Boolean) xaj0Var.a).booleanValue() ? (List) xaj0Var.b : null, !TextUtils.isEmpty((CharSequence) xaj0Var.c) ? (String) xaj0Var.c : "");
            }
        }) : c.just(xaj0.a(list, new ArrayList<String>() { // from class: com.p1.mobile.putong.core.ui.greet.ItemGreetGuidePic.1
        }, ""));
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ c m3144K(String str, xaj0 xaj0Var) {
        return m3148P(str, (List) xaj0Var.a, (List) xaj0Var.b, (String) xaj0Var.c);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ boolean m3145M(String str, int i, int i2, Intent intent) {
        if (i2 != -1 || !NullChecker.a(intent)) {
            return false;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h);
        if (vwb.J(arrayList)) {
            return true;
        }
        m3146N(str, arrayList);
        return true;
    }

    /* JADX INFO: renamed from: N */
    public void m3146N(final String str, List<Media> list) {
        act().duringCreated(new lsx(list, false).flatMap(new w9j() { // from class: l.b4q
            public final Object call(Object obj) {
                return this.f3323a.m3143G((List) obj);
            }
        }).observeOn(jo0.a()).last().compose(mkd0.Q()).flatMap(new w9j() { // from class: l.c4q
            public final Object call(Object obj) {
                xaj0 xaj0Var = (xaj0) obj;
                return ya5.K((List) xaj0Var.a, Greeting.TYPE, (String) null, UploadSource.get(CoreGiftPanelName.chat)).map(new w9j() { // from class: l.h4q
                    public final Object call(Object obj2) {
                        xaj0 xaj0Var2 = xaj0Var;
                        return xaj0.a((List) obj2, (List) xaj0Var2.b, (String) xaj0Var2.c);
                    }
                });
            }
        }).compose(mkd0.C()).switchMap(new w9j() { // from class: l.d4q
            public final Object call(Object obj) {
                return this.f4107a.m3144K(str, (xaj0) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.e4q
            public final void call(Object obj) {
                ItemGreetGuidePic.m3133C((Message) obj);
            }
        }, new e30() { // from class: l.f4q
            public final void call(Object obj) {
                ItemGreetGuidePic.m3139v(str, (Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public void m3147O(final String str) {
        zvf0.x("e_city_cover_send_pic", act().pageId());
        this.f1829a.getPaint().setFakeBoldText(true);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.z3q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9183a.m3135L(str, view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final c<Message> m3148P(String str, List<Media> list, List<String> list2, String str2) {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("picture");
        messageNew_.media = list;
        if (!vwb.J(list2)) {
            messageNew_.riskTags = list2;
        }
        if (!TextUtils.isEmpty(str2)) {
            messageNew_.localExtraInfo = str2;
        }
        return CoreModule.c.r0.u6(str, Channel.get("city_c"), messageNew_, (String) null, (d30) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m3149Q(final String str) {
        zvf0.r("e_city_cover_send_pic", act().pageId());
        getContext().startActivityForResult(MediaPickerAct.X1(getContext(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withMinPickCount(1).showPreviewEditBtn(false).build()).withSubmitButtonTitle("发送").needClickPreview(true).withFromType(14).build()), new a.a() { // from class: l.a4q
            /* JADX INFO: renamed from: a */
            public final boolean m5274a(int i, int i2, Intent intent) {
                return this.f2727a.m3145M(str, i, i2, intent);
            }
        });
        getContext().overridePendingTransition(szb0.f7494e, szb0.f7490a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3142F(this);
    }

    public ItemGreetGuidePic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGreetGuidePic(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
