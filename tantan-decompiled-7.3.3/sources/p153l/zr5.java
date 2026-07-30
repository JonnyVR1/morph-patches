package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Media;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes3.dex */
public final class zr5 {
    /* JADX INFO: renamed from: b */
    public static void m221153b(final Message message, VImage vImage, AutoVDraweeView autoVDraweeView, VText_NoTopPadding vText_NoTopPadding, final Act act) {
        if (message == null) {
            return;
        }
        int i = br5.m106038i(message) ? ibc0.f113788F0 : ibc0.f113770D0;
        if (vImage.getTag() == null || ((Integer) vImage.getTag()).intValue() != i) {
            vImage.setImageResource(i);
            vImage.setTag(Integer.valueOf(i));
        }
        if (!jyb.m147479J(message.media) && message.media.get(0).cover() != null && !TextUtils.isEmpty(message.media.get(0).cover().url)) {
            final Media media = message.media.get(0);
            String str = media.cover().url;
            if (!TextUtils.equals((CharSequence) autoVDraweeView.getTag(), str)) {
                autoVDraweeView.setImageUrl(str);
                autoVDraweeView.setZoomAnimationKey(k900.m148796h(message, media.cover()));
                autoVDraweeView.setTag(str);
            }
            autoVDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.yr5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreModule.m30933P().m143405a().mo180505n1(act, message, media);
                }
            });
        }
        boolean zIsEmpty = TextUtils.isEmpty(message.value);
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            vText_NoTopPadding.setText(message.value);
        }
        bnl0.m105524M(vText_NoTopPadding, z);
    }
}
