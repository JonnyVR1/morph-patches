package com.p046p1.mobile.putong.feed.newui.photoalbum.commend;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.newui.photoalbum.commend.FeedItemCommendBotEmojiView;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p149l.d30;
import p149l.e30;
import p149l.f3c0;
import p149l.f9h;
import p149l.u2h;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedItemCommendBotEmojiView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f41472c;

    /* JADX INFO: renamed from: d */
    public VImage f41473d;

    /* JADX INFO: renamed from: e */
    public VImage f41474e;

    /* JADX INFO: renamed from: f */
    public List<VImage> f41475f;

    public FeedItemCommendBotEmojiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m64056S(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m64057T(int i, e30 e30Var, int i2, int i3, Intent intent) {
        if (i3 != -1 || !NullChecker.m81303a(intent) || i2 != i) {
            return true;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selectedImages");
        if (vwb.m200296J(arrayList)) {
            return true;
        }
        e30Var.call((Media) arrayList.get(0));
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final void m64058V(View view) {
        f9h.m120083a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final void m64059W(ArrayList<Media> arrayList, Act act, final e30<Media> e30Var) {
        final int i = 10002;
        act.startActivityForResult(10002, FeedMemePhotoPreviewAct.m64065V1(act, arrayList), new C4317a.a() { // from class: l.e9h
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i2, int i3, Intent intent) {
                return FeedItemCommendBotEmojiView.m64057T(i, e30Var, i2, i3, intent);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean m64060X(Act act, e30 e30Var, int i, int i2, Intent intent) {
        if (i2 != -1 || !NullChecker.m81303a(intent)) {
            return true;
        }
        ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
        if (vwb.m200296J(arrayList)) {
            return true;
        }
        m64059W(arrayList, act, e30Var);
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m64061Y(e30 e30Var, View view) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(this.f41472c);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m64062Z(e30 e30Var, View view) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(this.f41473d);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m64063a0(final Act act, final e30<Media> e30Var) {
        act.startActivityForResult(10001, MediaPickerAct.m78919X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(4).build()), new C4317a.a() { // from class: l.d9h
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return this.f85121a.m64060X(act, e30Var, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m64064b0(Act act, final e30<VImage> e30Var, final e30<VImage> e30Var2, final d30 d30Var) {
        xdl0.m208329E0(this.f41472c, new View.OnClickListener() { // from class: l.a9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68171a.m64061Y(e30Var, view);
            }
        });
        xdl0.m208329E0(this.f41473d, new View.OnClickListener() { // from class: l.b9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74574a.m64062Z(e30Var2, view);
            }
        });
        xdl0.m208329E0(this.f41474e, new View.OnClickListener() { // from class: l.c9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemCommendBotEmojiView.m64056S(d30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64058V(this);
        this.f41475f = Arrays.asList(this.f41472c, this.f41473d, this.f41474e);
        xdl0.m208344M(this.f41474e, false);
        if (u2h.m191499h()) {
            this.f41472c.setImageResource(f3c0.f94665y0);
            this.f41473d.setImageResource(f3c0.f94673z0);
            this.f41474e.setImageResource(f3c0.f94281A0);
        }
    }

    public void setImageViewSelected(VImage vImage) {
        if (vImage == null) {
            for (int i = 0; i < this.f41475f.size(); i++) {
                if (this.f41475f.get(i).isSelected()) {
                    this.f41475f.get(i).setSelected(false);
                    return;
                }
            }
            return;
        }
        for (int i2 = 0; i2 < this.f41475f.size(); i2++) {
            if (vImage == this.f41475f.get(i2)) {
                vImage.setSelected(true);
            } else {
                this.f41475f.get(i2).setSelected(false);
            }
        }
    }

    public FeedItemCommendBotEmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedItemCommendBotEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setImageViewSelected(int i) {
        setImageViewSelected(this.f41475f.get(i));
    }
}
