package com.p000p1.mobile.putong.feed.newui.photoalbum.commend;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.newui.photoalbum.commend.FeedItemCommendBotEmojiView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.d30;
import l.e30;
import l.vwb;
import l.xdl0;
import p007l.f3c0;
import p007l.f9h;
import p007l.u2h;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedItemCommendBotEmojiView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f2933c;

    /* JADX INFO: renamed from: d */
    public VImage f2934d;

    /* JADX INFO: renamed from: e */
    public VImage f2935e;

    /* JADX INFO: renamed from: f */
    public List<VImage> f2936f;

    public FeedItemCommendBotEmojiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m5103S(d30 d30Var, View view) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m5104T(int i, e30 e30Var, int i2, int i3, Intent intent) {
        if (i3 != -1 || !NullChecker.a(intent) || i2 != i) {
            return true;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selectedImages");
        if (vwb.J(arrayList)) {
            return true;
        }
        e30Var.call((Media) arrayList.get(0));
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final void m5105V(View view) {
        f9h.m10108a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final void m5106W(ArrayList<Media> arrayList, Act act, final e30<Media> e30Var) {
        final int i = 10002;
        act.startActivityForResult(10002, FeedMemePhotoPreviewAct.m5112V1(act, arrayList), new a.a() { // from class: l.e9h
            /* JADX INFO: renamed from: a */
            public final boolean m9684a(int i2, int i3, Intent intent) {
                return FeedItemCommendBotEmojiView.m5104T(i, e30Var, i2, i3, intent);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean m5107X(Act act, e30 e30Var, int i, int i2, Intent intent) {
        if (i2 != -1 || !NullChecker.a(intent)) {
            return true;
        }
        ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h);
        if (vwb.J(arrayList)) {
            return true;
        }
        m5106W(arrayList, act, e30Var);
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m5108Y(e30 e30Var, View view) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(this.f2933c);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m5109Z(e30 e30Var, View view) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(this.f2934d);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m5110a0(final Act act, final e30<Media> e30Var) {
        act.startActivityForResult(10001, MediaPickerAct.X1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(4).build()), new a.a() { // from class: l.d9h
            /* JADX INFO: renamed from: a */
            public final boolean m9356a(int i, int i2, Intent intent) {
                return this.f6871a.m5107X(act, e30Var, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m5111b0(Act act, final e30<VImage> e30Var, final e30<VImage> e30Var2, final d30 d30Var) {
        xdl0.E0(this.f2933c, new View.OnClickListener() { // from class: l.a9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5668a.m5108Y(e30Var, view);
            }
        });
        xdl0.E0(this.f2934d, new View.OnClickListener() { // from class: l.b9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6190a.m5109Z(e30Var2, view);
            }
        });
        xdl0.E0(this.f2935e, new View.OnClickListener() { // from class: l.c9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemCommendBotEmojiView.m5103S(d30Var, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5105V(this);
        this.f2936f = Arrays.asList(this.f2933c, this.f2934d, this.f2935e);
        xdl0.M(this.f2935e, false);
        if (u2h.m14723h()) {
            this.f2933c.setImageResource(f3c0.f7948y0);
            this.f2934d.setImageResource(f3c0.f7956z0);
            this.f2935e.setImageResource(f3c0.f7564A0);
        }
    }

    public void setImageViewSelected(VImage vImage) {
        if (vImage == null) {
            for (int i = 0; i < this.f2936f.size(); i++) {
                if (this.f2936f.get(i).isSelected()) {
                    this.f2936f.get(i).setSelected(false);
                    return;
                }
            }
            return;
        }
        for (int i2 = 0; i2 < this.f2936f.size(); i2++) {
            if (vImage == this.f2936f.get(i2)) {
                vImage.setSelected(true);
            } else {
                this.f2936f.get(i2).setSelected(false);
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
        setImageViewSelected(this.f2936f.get(i));
    }
}
