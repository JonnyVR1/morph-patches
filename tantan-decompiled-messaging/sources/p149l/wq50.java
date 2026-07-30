package p149l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemPopUp;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTextDrawerConfig;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import p149l.ho2;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
public class wq50<D extends ho2, V extends s7m> extends h4t<D, V> {

    /* JADX INFO: renamed from: i */
    public BLiveOperationItem f187644i;

    /* JADX INFO: renamed from: j */
    public final String f187645j;

    public wq50(bsm bsmVar) {
        super(bsmVar);
        this.f187645j = "#33000000";
    }

    /* JADX INFO: renamed from: L3 */
    public int mo143249L3() {
        return t100.m186890d(20.0f);
    }

    /* JADX INFO: renamed from: M3 */
    public final void m205018M3(BLiveOperationItem bLiveOperationItem) {
        BLiveOperationItemPopUp bLiveOperationItemPopUp = bLiveOperationItem.popup;
        if (bLiveOperationItemPopUp != null && TEnum.equals(bLiveOperationItemPopUp.popupType, BLiveOperationPopupType.H5PopUp) && bLiveOperationItem.popup.h5PopUp != null && bLiveOperationItem.type.equals("shootGame") && ((Integer) m129297F3(new twe0())).intValue() == 1) {
            bLiveOperationItem.popup.h5PopUp.h5Url = bLiveOperationItem.popup.h5PopUp.h5Url + "&state=1";
            bLiveOperationItem.popup.h5PopUp.jumpScheme = bLiveOperationItem.popup.h5PopUp.jumpScheme + URLEncoder.encode("&state=1");
        }
    }

    /* JADX INFO: renamed from: N3 */
    public void m205019N3(BLiveOperationPopupType bLiveOperationPopupType) {
        BLiveOperation bLiveOperationNew_ = BLiveOperation.new_();
        bLiveOperationNew_.showOperationDrawer = true;
        BLiveOperationItem bLiveOperationItem = this.f187644i;
        bLiveOperationItem.popup.isFirstPriority = true;
        BLiveOperationItem bLiveOperationItemMo223809clone = bLiveOperationItem.mo223809clone();
        if (!TEnum.equals(bLiveOperationPopupType, "unknown_")) {
            bLiveOperationItemMo223809clone.popup.popupType = bLiveOperationPopupType;
        }
        m205018M3(bLiveOperationItemMo223809clone);
        bLiveOperationNew_.operations = vwb.m200324f0(bLiveOperationItemMo223809clone);
        m206027E2().m132066G1(bLiveOperationNew_);
    }

    /* JADX INFO: renamed from: O3 */
    public GradientDrawable m205020O3() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#33000000"), Color.parseColor("#33000000")});
        gradientDrawable.setCornerRadius(t100.m186890d(20.0f));
        gradientDrawable.setAlpha(76);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m205021P3(Bitmap bitmap) {
        Drawable drawableM205020O3 = m205020O3();
        if (bitmap != null) {
            drawableM205020O3 = new BitmapDrawable(bitmap);
        }
        mo143250T3(drawableM205020O3);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m205022R3(Throwable th) {
        mo143250T3(m205020O3());
    }

    /* JADX INFO: renamed from: S3 */
    public void m205023S3(BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig) {
        if (bLiveOperationTextDrawerConfig == null) {
            BLiveOperation bLiveOperationM132174x1 = m206027E2().m132174x1();
            if (NullChecker.m81303a(bLiveOperationM132174x1) && NullChecker.m81303a(bLiveOperationM132174x1.defaultConfig)) {
                bLiveOperationTextDrawerConfig = bLiveOperationM132174x1.defaultConfig.textDrawer;
            }
        }
        if (NullChecker.m81303a(bLiveOperationTextDrawerConfig)) {
            if (TEnum.equals(bLiveOperationTextDrawerConfig.loadingType, "image")) {
                m205025V3(bLiveOperationTextDrawerConfig.imageUrl);
            } else {
                m205024U3(bLiveOperationTextDrawerConfig);
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void m205024U3(BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig) {
        GradientDrawable gradientDrawableM205020O3 = m205020O3();
        if (!TextUtils.isEmpty(bLiveOperationTextDrawerConfig.startColor) && !TextUtils.isEmpty(bLiveOperationTextDrawerConfig.endColor)) {
            try {
                gradientDrawableM205020O3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor(bLiveOperationTextDrawerConfig.startColor), Color.parseColor(bLiveOperationTextDrawerConfig.endColor)});
            } catch (IllegalArgumentException unused) {
            }
        }
        gradientDrawableM205020O3.setCornerRadius(mo143249L3());
        gradientDrawableM205020O3.setAlpha((int) ((bLiveOperationTextDrawerConfig.transparency / 100.0f) * 255.0f));
        mo143250T3(gradientDrawableM205020O3);
    }

    /* JADX INFO: renamed from: V3 */
    public void m205025V3(String str) {
        duringCreated(hxs.m133392e("context_livingAct", str).observeOn(jo0.m142408a())).subscribe(ffw.m121194e(new e30() { // from class: l.uq50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177710a.m205021P3((Bitmap) obj);
            }
        }, new e30() { // from class: l.vq50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182593a.m205022R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void mo143250T3(Drawable drawable) {
    }
}
