package p153l;

import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes9.dex */
public class m120 {
    /* JADX INFO: renamed from: a */
    public static void m156551a(String str, ImageView imageView, int i) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
            if (embeddedPicture != null) {
                imageView.setImageBitmap(BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length));
            } else {
                imageView.setImageResource(i);
            }
            mediaMetadataRetriever.release();
        } catch (Exception unused) {
        }
    }
}
