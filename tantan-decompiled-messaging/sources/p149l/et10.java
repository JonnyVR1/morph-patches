package p149l;

import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes13.dex */
public class et10 {
    /* JADX INFO: renamed from: a */
    public static void m117969a(String str, ImageView imageView, int i) {
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
