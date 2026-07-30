package com.momo.xeengine.svgaplayer;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.SoundPool;
import com.momo.xeengine.svgaplayer.proto.AudioEntity;
import com.momo.xeengine.svgaplayer.proto.MovieEntity;
import com.momo.xeengine.svgaplayer.proto.MovieParams;
import com.momo.xeengine.svgaplayer.proto.SpriteEntity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u00100\u001a\u000201J\u001b\u00102\u001a\u0002012\f\u00103\u001a\b\u0012\u0004\u0012\u00020104H\u0000¢\u0006\u0002\b5J\u001e\u00106\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u00032\f\u00107\u001a\b\u0012\u0004\u0012\u00020104H\u0002J\u0010\u00108\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u00109\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR6\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020)0\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u001e\u0010-\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020,@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006:"}, d2 = {"Lcom/momo/xeengine/svgaplayer/SVGAVideoEntity;", "", "obj", "Lcom/momo/xeengine/svgaplayer/proto/MovieEntity;", "(Lcom/momo/xeengine/svgaplayer/proto/MovieEntity;)V", "<set-?>", "", "FPS", "getFPS", "()I", "_movieItem", "get_movieItem", "()Lcom/momo/xeengine/svgaplayer/proto/MovieEntity;", "set_movieItem", "antiAlias", "", "getAntiAlias", "()Z", "setAntiAlias", "(Z)V", "audios", "", "Lcom/momo/xeengine/svgaplayer/SVGAAudioEntity;", "getAudios", "()Ljava/util/List;", "setAudios", "(Ljava/util/List;)V", "frames", "getFrames", "Ljava/util/HashMap;", "", "Landroid/graphics/Bitmap;", "images", "getImages", "()Ljava/util/HashMap;", "soundPool", "Landroid/media/SoundPool;", "getSoundPool", "()Landroid/media/SoundPool;", "setSoundPool", "(Landroid/media/SoundPool;)V", "Lcom/momo/xeengine/svgaplayer/SVGAVideoSpriteEntity;", "sprites", "getSprites", "Lcom/momo/xeengine/svgaplayer/SVGARect;", "videoSize", "getVideoSize", "()Lcom/momo/xeengine/svgaplayer/SVGARect;", "clearVideoData", "", "prepare", "callback", "Lkotlin/Function0;", "prepare$gift_player_release", "resetAudios", "completionBlock", "resetImages", "resetSprites", "gift_player_release"}, k = 1, mv = {1, 1, 15})
public final class SVGAVideoEntity {
    private int FPS;

    @Nullable
    private MovieEntity _movieItem;
    private boolean antiAlias;

    @NotNull
    private List<SVGAAudioEntity> audios;
    private int frames;

    @NotNull
    private HashMap<String, Bitmap> images;

    @Nullable
    private SoundPool soundPool;

    @NotNull
    private List<SVGAVideoSpriteEntity> sprites;

    @NotNull
    private SVGARect videoSize;

    public SVGAVideoEntity(@NotNull MovieEntity movieEntity) {
        movieEntity.getClass();
        this.antiAlias = true;
        this.videoSize = new SVGARect(0.0d, 0.0d, 0.0d, 0.0d);
        this.FPS = 15;
        this.sprites = new ArrayList();
        this.audios = new ArrayList();
        this.images = new HashMap<>();
        this._movieItem = movieEntity;
        MovieParams movieParams = movieEntity.params;
        if (movieParams != null) {
            Float f = movieParams.viewBoxWidth;
            double dFloatValue = f != null ? f.floatValue() : 0.0f;
            Float f2 = movieParams.viewBoxHeight;
            this.videoSize = new SVGARect(0.0d, 0.0d, dFloatValue, f2 != null ? f2.floatValue() : 0.0f);
            Integer num = movieParams.fps;
            this.FPS = num != null ? num.intValue() : 20;
            Integer num2 = movieParams.frames;
            this.frames = num2 != null ? num2.intValue() : 0;
        }
        try {
            resetImages(movieEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        resetSprites(movieEntity);
    }

    private final void resetAudios(final MovieEntity obj, final Function0<Unit> completionBlock) throws IOException {
        Set<Map.Entry<String, ByteString>> setEntrySet;
        List<AudioEntity> list = obj.audios;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            final List<AudioEntity> list2 = list;
            if (list2 != null) {
                final Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 0;
                SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).setMaxStreams(Math.min(12, list2.size())).build();
                HashMap map = new HashMap();
                soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.momo.xeengine.svgaplayer.SVGAVideoEntity$resetAudios$$inlined$let$lambda$1
                    @Override // android.media.SoundPool.OnLoadCompleteListener
                    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                        Ref.IntRef intRef2 = intRef;
                        int i3 = intRef2.element + 1;
                        intRef2.element = i3;
                        if (i3 >= list2.size()) {
                            completionBlock.invoke();
                        }
                    }
                });
                HashMap map2 = new HashMap();
                Map<String, ByteString> map3 = obj.images;
                if (map3 != null && (setEntrySet = map3.entrySet()) != null) {
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        byte[] byteArray = ((ByteString) entry.getValue()).toByteArray();
                        byteArray.getClass();
                        if (byteArray.length >= 4) {
                            List listSlice = ArraysKt.slice(byteArray, new IntRange(0, 3));
                            if (((Number) listSlice.get(0)).byteValue() == 73 && ((Number) listSlice.get(1)).byteValue() == 68 && ((Number) listSlice.get(2)).byteValue() == 51 && ((Number) listSlice.get(3)).byteValue() == 3) {
                                str.getClass();
                                map2.put(str, byteArray);
                            }
                        }
                    }
                }
                if (map2.size() > 0) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        File fileCreateTempFile = File.createTempFile((String) entry2.getKey(), ".mp3");
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        fileOutputStream.write((byte[]) entry2.getValue());
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Object key = entry2.getKey();
                        fileCreateTempFile.getClass();
                        map.put(key, fileCreateTempFile);
                    }
                }
                for (AudioEntity audioEntity : list2) {
                    audioEntity.getClass();
                    SVGAAudioEntity sVGAAudioEntity = new SVGAAudioEntity(audioEntity);
                    File file = (File) map.get(sVGAAudioEntity.getAudioKey());
                    if (file != null) {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        sVGAAudioEntity.setSoundID(Integer.valueOf(soundPoolBuild.load(fileInputStream.getFD(), (long) ((((double) sVGAAudioEntity.getStartTime()) / ((double) sVGAAudioEntity.getTotalTime())) * ((double) fileInputStream.available())), fileInputStream.available(), 1)));
                        fileInputStream.close();
                    }
                    this.audios.add(sVGAAudioEntity);
                }
                this.soundPool = soundPoolBuild;
                return;
            }
        }
    }

    private final void resetImages(MovieEntity obj) {
        Set<Map.Entry<String, ByteString>> setEntrySet;
        Map<String, ByteString> map = obj.images;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            SVGAVideoEntityKt.options.inPreferredConfig = Bitmap.Config.RGB_565;
            byte[] byteArray = ((ByteString) entry.getValue()).toByteArray();
            byteArray.getClass();
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, SVGAVideoEntityKt.options);
            if (bitmapDecodeByteArray != null) {
                HashMap<String, Bitmap> map2 = this.images;
                str.getClass();
                map2.put(str, bitmapDecodeByteArray);
            }
        }
    }

    private final void resetSprites(MovieEntity obj) {
        for (SpriteEntity spriteEntity : obj.sprites) {
            List<SVGAVideoSpriteEntity> list = this.sprites;
            spriteEntity.getClass();
            list.add(new SVGAVideoSpriteEntity(spriteEntity));
        }
    }

    public final void clearVideoData() {
        this.images.clear();
        this.sprites.clear();
        this.audios.clear();
    }

    public final boolean getAntiAlias() {
        return this.antiAlias;
    }

    @NotNull
    public final List<SVGAAudioEntity> getAudios() {
        return this.audios;
    }

    public final int getFPS() {
        return this.FPS;
    }

    public final int getFrames() {
        return this.frames;
    }

    @NotNull
    public final HashMap<String, Bitmap> getImages() {
        return this.images;
    }

    @Nullable
    public final SoundPool getSoundPool() {
        return this.soundPool;
    }

    @NotNull
    public final List<SVGAVideoSpriteEntity> getSprites() {
        return this.sprites;
    }

    @NotNull
    public final SVGARect getVideoSize() {
        return this.videoSize;
    }

    @Nullable
    public final MovieEntity get_movieItem() {
        return this._movieItem;
    }

    public final void prepare$gift_player_release(@NotNull final Function0<Unit> callback) throws IOException {
        callback.getClass();
        MovieEntity movieEntity = this._movieItem;
        if (movieEntity != null) {
            resetAudios(movieEntity, new Function0<Unit>() { // from class: com.momo.xeengine.svgaplayer.SVGAVideoEntity$prepare$$inlined$let$lambda$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m12127invoke();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m12127invoke() {
                    callback.invoke();
                }
            });
        }
    }

    public final void setAntiAlias(boolean z) {
        this.antiAlias = z;
    }

    public final void setAudios(@NotNull List<SVGAAudioEntity> list) {
        list.getClass();
        this.audios = list;
    }

    public final void setSoundPool(@Nullable SoundPool soundPool) {
        this.soundPool = soundPool;
    }

    public final void set_movieItem(@Nullable MovieEntity movieEntity) {
        this._movieItem = movieEntity;
    }
}
