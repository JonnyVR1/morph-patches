package com.p051p1.mobile.putong.feed.newui.photoalbum.commend;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.newui.photoalbum.commend.FeedItemCommendBotEmojiView;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.j4h;
import p153l.jyb;
import p153l.lbc0;
import p153l.uah;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedItemCommendBotEmojiView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f42320c;

    /* JADX INFO: renamed from: d */
    public VImage f42321d;

    /* JADX INFO: renamed from: e */
    public VImage f42322e;

    /* JADX INFO: renamed from: f */
    public List<VImage> f42323f;

    public FeedItemCommendBotEmojiView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m65239S(x20 x20Var, View view) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ boolean m65240T(int i, y20 y20Var, int i2, int i3, Intent intent) {
        if (i3 != -1 || !NullChecker.m82486a(intent) || i2 != i) {
            return true;
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selectedImages");
        if (jyb.m147479J(arrayList)) {
            return true;
        }
        y20Var.call((Media) arrayList.get(0));
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final void m65241V(View view) {
        uah.m195166a(this, view);
    }

    /* JADX INFO: renamed from: W */
    public final void m65242W(ArrayList<Media> arrayList, Act act, final y20<Media> y20Var) {
        final int i = 10002;
        act.startActivityForResult(10002, FeedMemePhotoPreviewAct.m65248X1(act, arrayList), new C4468a.a() { // from class: l.tah
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i2, int i3, Intent intent) {
                return FeedItemCommendBotEmojiView.m65240T(i, y20Var, i2, i3, intent);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ boolean m65243X(Act act, y20 y20Var, int i, int i2, Intent intent) {
        if (i2 != -1 || !NullChecker.m82486a(intent)) {
            return true;
        }
        ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
        if (jyb.m147479J(arrayList)) {
            return true;
        }
        m65242W(arrayList, act, y20Var);
        return true;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m65244Y(y20 y20Var, View view) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(this.f42320c);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m65245Z(y20 y20Var, View view) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(this.f42321d);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m65246a0(final Act act, final y20<Media> y20Var) {
        act.startActivityForResult(10001, MediaPickerAct.m80102Y1(act, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).build()).withFromType(4).build()), new C4468a.a() { // from class: l.sah
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return this.f167045a.m65243X(act, y20Var, i, i2, intent);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public void m65247b0(Act act, final y20<VImage> y20Var, final y20<VImage> y20Var2, final x20 x20Var) {
        bnl0.m105509E0(this.f42320c, new View.OnClickListener() { // from class: l.pah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151277a.m65244Y(y20Var, view);
            }
        });
        bnl0.m105509E0(this.f42321d, new View.OnClickListener() { // from class: l.qah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156382a.m65245Z(y20Var2, view);
            }
        });
        bnl0.m105509E0(this.f42322e, new View.OnClickListener() { // from class: l.rah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedItemCommendBotEmojiView.m65239S(x20Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65241V(this);
        this.f42323f = Arrays.asList(this.f42320c, this.f42321d, this.f42322e);
        bnl0.m105524M(this.f42322e, false);
        if (j4h.m143424h()) {
            this.f42320c.setImageResource(lbc0.f131183y0);
            this.f42321d.setImageResource(lbc0.f131191z0);
            this.f42322e.setImageResource(lbc0.f130799A0);
        }
    }

    public void setImageViewSelected(VImage vImage) {
        if (vImage == null) {
            for (int i = 0; i < this.f42323f.size(); i++) {
                if (this.f42323f.get(i).isSelected()) {
                    this.f42323f.get(i).setSelected(false);
                    return;
                }
            }
            return;
        }
        for (int i2 = 0; i2 < this.f42323f.size(); i2++) {
            if (vImage == this.f42323f.get(i2)) {
                vImage.setSelected(true);
            } else {
                this.f42323f.get(i2).setSelected(false);
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
        setImageViewSelected(this.f42323f.get(i));
    }
}
