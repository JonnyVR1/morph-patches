package p153l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemPopUp;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTextDrawerConfig;
import com.tantanapp.common.utils.NullChecker;
import java.net.URLEncoder;
import p153l.iam;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class cz50<D extends oo2, V extends iam> extends i6t<D, V> {

    /* JADX INFO: renamed from: i */
    public BLiveOperationItem f84425i;

    /* JADX INFO: renamed from: j */
    public final String f84426j;

    public cz50(dum dumVar) {
        super(dumVar);
        this.f84426j = "#33000000";
    }

    /* JADX INFO: renamed from: L3 */
    public int mo113259L3() {
        return qa00.m175859d(20.0f);
    }

    /* JADX INFO: renamed from: M3 */
    public final void m113260M3(BLiveOperationItem bLiveOperationItem) {
        BLiveOperationItemPopUp bLiveOperationItemPopUp = bLiveOperationItem.popup;
        if (bLiveOperationItemPopUp != null && TEnum.equals(bLiveOperationItemPopUp.popupType, BLiveOperationPopupType.H5PopUp) && bLiveOperationItem.popup.h5PopUp != null && bLiveOperationItem.type.equals("shootGame") && ((Integer) m138856F3(new a5f0())).intValue() == 1) {
            bLiveOperationItem.popup.h5PopUp.h5Url = bLiveOperationItem.popup.h5PopUp.h5Url + "&state=1";
            bLiveOperationItem.popup.h5PopUp.jumpScheme = bLiveOperationItem.popup.h5PopUp.jumpScheme + URLEncoder.encode("&state=1");
        }
    }

    /* JADX INFO: renamed from: N3 */
    public void m113261N3(BLiveOperationPopupType bLiveOperationPopupType) {
        BLiveOperation bLiveOperationNew_ = BLiveOperation.new_();
        bLiveOperationNew_.showOperationDrawer = true;
        BLiveOperationItem bLiveOperationItem = this.f84425i;
        bLiveOperationItem.popup.isFirstPriority = true;
        BLiveOperationItem bLiveOperationItemMo225055clone = bLiveOperationItem.mo225055clone();
        if (!TEnum.equals(bLiveOperationPopupType, "unknown_")) {
            bLiveOperationItemMo225055clone.popup.popupType = bLiveOperationPopupType;
        }
        m113260M3(bLiveOperationItemMo225055clone);
        bLiveOperationNew_.operations = jyb.m147507f0(bLiveOperationItemMo225055clone);
        m213810E2().m168455G1(bLiveOperationNew_);
    }

    /* JADX INFO: renamed from: O3 */
    public GradientDrawable m113262O3() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#33000000"), Color.parseColor("#33000000")});
        gradientDrawable.setCornerRadius(qa00.m175859d(20.0f));
        gradientDrawable.setAlpha(76);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m113263P3(Bitmap bitmap) {
        Drawable drawableM113262O3 = m113262O3();
        if (bitmap != null) {
            drawableM113262O3 = new BitmapDrawable(bitmap);
        }
        mo113266T3(drawableM113262O3);
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m113264R3(Throwable th) {
        mo113266T3(m113262O3());
    }

    /* JADX INFO: renamed from: S3 */
    public void m113265S3(BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig) {
        if (bLiveOperationTextDrawerConfig == null) {
            BLiveOperation bLiveOperationM168558x1 = m213810E2().m168558x1();
            if (NullChecker.m82486a(bLiveOperationM168558x1) && NullChecker.m82486a(bLiveOperationM168558x1.defaultConfig)) {
                bLiveOperationTextDrawerConfig = bLiveOperationM168558x1.defaultConfig.textDrawer;
            }
        }
        if (NullChecker.m82486a(bLiveOperationTextDrawerConfig)) {
            if (TEnum.equals(bLiveOperationTextDrawerConfig.loadingType, "image")) {
                m113268V3(bLiveOperationTextDrawerConfig.imageUrl);
            } else {
                m113267U3(bLiveOperationTextDrawerConfig);
            }
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void m113267U3(BLiveOperationTextDrawerConfig bLiveOperationTextDrawerConfig) {
        GradientDrawable gradientDrawableM113262O3 = m113262O3();
        if (!TextUtils.isEmpty(bLiveOperationTextDrawerConfig.startColor) && !TextUtils.isEmpty(bLiveOperationTextDrawerConfig.endColor)) {
            try {
                gradientDrawableM113262O3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor(bLiveOperationTextDrawerConfig.startColor), Color.parseColor(bLiveOperationTextDrawerConfig.endColor)});
            } catch (IllegalArgumentException unused) {
            }
        }
        gradientDrawableM113262O3.setCornerRadius(mo113259L3());
        gradientDrawableM113262O3.setAlpha((int) ((bLiveOperationTextDrawerConfig.transparency / 100.0f) * 255.0f));
        mo113266T3(gradientDrawableM113262O3);
    }

    /* JADX INFO: renamed from: V3 */
    public void m113268V3(String str) {
        duringCreated(izs.m142854e("context_livingAct", str).observeOn(fo0.m126432a())).subscribe(dhw.m115826e(new y20() { // from class: l.az50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74095a.m113263P3((Bitmap) obj);
            }
        }, new y20() { // from class: l.bz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79095a.m113264R3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void mo113266T3(Drawable drawable) {
    }
}
