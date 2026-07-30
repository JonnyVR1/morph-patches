package com.core.glcore.util;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import io.agora.utils2.internal.CommonUtility;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes.dex */
public class MediaPlayerDataSourceHelper {
    public static String getRingtonePathFromContentUri(Context context, Uri uri) {
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
        cursorQuery.close();
        return string;
    }

    private static String getRingtoneUriFromPath(Context context, String str) {
        Uri contentUriForPath = MediaStore.Audio.Media.getContentUriForPath(str);
        Cursor cursorQuery = context.getContentResolver().query(contentUriForPath, null, "_data='" + str + "'", null, null);
        cursorQuery.moveToFirst();
        long j = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
        cursorQuery.close();
        if (contentUriForPath.toString().endsWith(String.valueOf(j))) {
            return contentUriForPath.toString();
        }
        return contentUriForPath + "/" + j;
    }

    public static void setMediaPlayerDataSource(Context context, MediaPlayer mediaPlayer, String str) throws Exception {
        if (str.startsWith(CommonUtility.PREFIX_URI)) {
            try {
                str = getRingtonePathFromContentUri(context, Uri.parse(str));
            } catch (Exception unused) {
            }
        }
        try {
            try {
                setMediaPlayerDataSourcePostHoneyComb(context, mediaPlayer, str);
            } catch (Exception unused2) {
                String ringtoneUriFromPath = getRingtoneUriFromPath(context, str);
                mediaPlayer.reset();
                mediaPlayer.setDataSource(ringtoneUriFromPath);
            }
        } catch (Exception unused3) {
            setMediaPlayerDataSourceUsingFileDescriptor(context, mediaPlayer, str);
        }
    }

    private static void setMediaPlayerDataSourcePostHoneyComb(Context context, MediaPlayer mediaPlayer, String str) throws Exception {
        mediaPlayer.reset();
        mediaPlayer.setDataSource(context, Uri.parse(Uri.encode(str)));
    }

    private static void setMediaPlayerDataSourcePreHoneyComb(Context context, MediaPlayer mediaPlayer, String str) throws Exception {
        mediaPlayer.reset();
        mediaPlayer.setDataSource(str);
    }

    private static void setMediaPlayerDataSourceUsingFileDescriptor(Context context, MediaPlayer mediaPlayer, String str) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        mediaPlayer.reset();
        mediaPlayer.setDataSource(fileInputStream.getFD());
        fileInputStream.close();
    }
}
