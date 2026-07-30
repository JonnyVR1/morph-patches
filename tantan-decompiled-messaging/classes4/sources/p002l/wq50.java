package p002l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveOperation;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUp;
import com.p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p1.mobile.putong.live.base.data.BLiveOperationTextDrawerConfig;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import l.e30;
import l.ffw;
import l.hxs;
import l.jo0;
import l.s7m;
import l.t100;
import l.vwb;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wq50<D extends ho2, V extends s7m> extends h4t<D, V> {

    /* JADX INFO: renamed from: i */
    public BLiveOperationItem f21910i;

    /* JADX INFO: renamed from: j */
    public final String f21911j;

    public wq50(bsm bsmVar) {
        super(bsmVar);
        this.f21911j = "#33000000";
    }

    /* JADX INFO: renamed from: L3 */
    public int mo16241L3() {
        return t100.d(20.0f);
    }

    /* JADX INFO: renamed from: M3 */
    public final void m25293M3(BLiveOperationItem bLiveOperationItem) {
        BLiveOperationItemPopUp bLiveOperationItemPopUp = bLiveOperationItem.popup;
        if (bLiveOperationItemPopUp != null && TEnum.equals(bLiveOperationItemPopUp.popupType, "H5PopUp") && bLiveOperationItem.popup.h5PopUp != null && bLiveOperationItem.type.equals(LiveMessage.LiveMessageType.SHOOT_GAME) && ((Integer) m14184F3(new twe0())).intValue() == 1) {
            bLiveOperationItem.popup.h5PopUp.h5Url = bLiveOperationItem.popup.h5PopUp.h5Url + "&state=1";
            bLiveOperationItem.popup.h5PopUp.jumpScheme = bLiveOperationItem.popup.h5PopUp.jumpScheme + URLEncoder.encode("&state=1");
        }
    }

    /* JADX INFO: renamed from: N3 */
    public void m25294N3(BLiveOperationPopupType bLiveOperationPopupType) {
        BLiveOperation bLiveOperationNew_ = BLiveOperation.new_();
        bLiveOperationNew_.showOperationDrawer = true;
        BLiveOperationItem bLiveOperationItem = this.f21910i;
        bLiveOperationItem.popup.isFirstPriority = true;
        BLiveOperationItem bLiveOperationItemClone = bLiveOperationItem.clone();
        if (!TEnum.equals(bLiveOperationPopupType, "unknown_")) {
            bLiveOperationItemClone.popup.popupType = bLiveOperationPopupType;
        }
        m25293M3(bLiveOperationItemClone);
        bLiveOperationNew_.operations = vwb.f0(new BLiveOperationItem[]{bLiveOperationItemClone});
        m25547E2().m14502G1(bLiveOperationNew_);
    }

    /* JADX INFO: renamed from: O3 */
    public GradientDrawable m25295O3() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#33000000"), Color.parseColor("#33000000")});
        gradientDrawable.setCornerRadius(t100.d(20.0f));
        gradientDrawable.setAlpha(76);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m25296P3(Bitmap bitmap) {
        Drawable drawableM25295O3 = m25295O3();
        if (bitmap != null) {
            drawableM25295O3 = new BitmapDrawable(bitmap);
        }
        mo16243T3(drawableM25295O3);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m25297R3(Throwable th) {
        mo16243T3(m25295O3());
    }

    /* JADX INFO: renamed from: S3 */
    public void m25298S3(BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig) {
        if (bLiveOperationTextDrawerConfig == null) {
            BLiveOperation bLiveOperationM14610x1 = m25547E2().m14610x1();
            if (NullChecker.a(bLiveOperationM14610x1) && NullChecker.a(bLiveOperationM14610x1.defaultConfig)) {
                bLiveOperationTextDrawerConfig = bLiveOperationM14610x1.defaultConfig.textDrawer;
            }
        }
        if (NullChecker.a(bLiveOperationTextDrawerConfig)) {
            if (TEnum.equals(bLiveOperationTextDrawerConfig.loadingType, "image")) {
                m25300V3(bLiveOperationTextDrawerConfig.imageUrl);
            } else {
                m25299U3(bLiveOperationTextDrawerConfig);
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void m25299U3(BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig) {
        GradientDrawable gradientDrawableM25295O3 = m25295O3();
        if (!TextUtils.isEmpty(bLiveOperationTextDrawerConfig.startColor) && !TextUtils.isEmpty(bLiveOperationTextDrawerConfig.endColor)) {
            try {
                gradientDrawableM25295O3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor(bLiveOperationTextDrawerConfig.startColor), Color.parseColor(bLiveOperationTextDrawerConfig.endColor)});
            } catch (IllegalArgumentException unused) {
            }
        }
        gradientDrawableM25295O3.setCornerRadius(mo16241L3());
        gradientDrawableM25295O3.setAlpha((int) ((bLiveOperationTextDrawerConfig.transparency / 100.0f) * 255.0f));
        mo16243T3(gradientDrawableM25295O3);
    }

    /* JADX INFO: renamed from: V3 */
    public void m25300V3(String str) {
        duringCreated(hxs.e("context_livingAct", str).observeOn(jo0.a())).subscribe(ffw.e(new e30() { // from class: l.uq50
            public final void call(Object obj) {
                this.f20750a.m25296P3((Bitmap) obj);
            }
        }, new e30() { // from class: l.vq50
            public final void call(Object obj) {
                this.f21263a.m25297R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void mo16243T3(Drawable drawable) {
    }
}
