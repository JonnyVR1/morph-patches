package p003l;

import android.text.TextUtils;
import android.view.View;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Media;
import l.c3c0;
import l.vwb;
import l.xdl0;
import l.xp5;
import p028v.AutoVDraweeView;
import p028v.VImage;
import p028v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class vq5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m8401b(final Message message, VImage vImage, AutoVDraweeView autoVDraweeView, VText_NoTopPadding vText_NoTopPadding, final Act act) {
        if (message == null) {
            return;
        }
        int i = xp5.i(message) ? c3c0.F0 : c3c0.D0;
        if (vImage.getTag() == null || ((Integer) vImage.getTag()).intValue() != i) {
            vImage.setImageResource(i);
            vImage.setTag(Integer.valueOf(i));
        }
        if (!vwb.J(message.media) && ((Media) message.media.get(0)).cover() != null && !TextUtils.isEmpty(((Media) ((Media) message.media.get(0)).cover()).url)) {
            final Media media = (Media) message.media.get(0);
            String str = ((Media) media.cover()).url;
            if (!TextUtils.equals((CharSequence) autoVDraweeView.getTag(), str)) {
                autoVDraweeView.setImageUrl(str);
                autoVDraweeView.setZoomAnimationKey(n000.m6523h(message, media.cover()));
                autoVDraweeView.setTag(str);
            }
            autoVDraweeView.setOnClickListener(new View.OnClickListener() { // from class: l.uq5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreModule.P().a().n1(act, message, media);
                }
            });
        }
        boolean zIsEmpty = TextUtils.isEmpty(message.value);
        boolean z = !zIsEmpty;
        if (!zIsEmpty) {
            vText_NoTopPadding.setText(message.value);
        }
        xdl0.M(vText_NoTopPadding, z);
    }
}
