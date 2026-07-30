package com.tencent.liteav.audio;

import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.C14212c;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TXCSoundEffectPlayer implements TXAudioEffectManager.TXMusicPlayObserver {
    private static final String TAG = "AudioCenter:TXCSoundEffectPlayer";
    private static WeakReference<InterfaceC14145c> mWeakSoundEffectListener;
    private List<Integer> mShortEffectorIDList = new ArrayList();

    /* JADX INFO: renamed from: com.tencent.liteav.audio.TXCSoundEffectPlayer$a */
    public static class C14140a {

        /* JADX INFO: renamed from: a */
        private static final TXCSoundEffectPlayer f58831a = new TXCSoundEffectPlayer();
    }

    static {
        C14215f.m84239f();
    }

    private String checkIfAssetsFile(String str) throws Throwable {
        long length;
        String str2;
        if (!TextUtils.isEmpty(str) && TXCCommonUtil.getAppContext() != null) {
            if (!str.startsWith("/assets/")) {
                return str;
            }
            String strSubstring = str.substring(8);
            try {
                try {
                    length = TXCCommonUtil.getAppContext().getAssets().openFd(strSubstring).getLength();
                } catch (Exception e) {
                    TXCLog.m84149e(TAG, "playAudioEffect openFd error " + e.toString());
                    length = 0;
                }
                String effectCachePath = getEffectCachePath();
                File file = new File(effectCachePath);
                if (!file.exists()) {
                    file.mkdirs();
                } else if (file.isFile()) {
                    file.delete();
                    file.mkdirs();
                }
                int iLastIndexOf = strSubstring.lastIndexOf(File.separatorChar);
                if (iLastIndexOf != -1) {
                    str2 = effectCachePath + File.separator + length + "_" + strSubstring.substring(iLastIndexOf + 1);
                } else {
                    str2 = effectCachePath + File.separator + length + "_" + strSubstring;
                }
                str = str2;
                if (!C14212c.m84209a(str)) {
                    C14212c.m84202a(TXCCommonUtil.getAppContext(), strSubstring, str);
                }
            } catch (Exception e2) {
                TXCLog.m84149e(TAG, "playAudioEffect error " + e2.toString());
            }
        }
        return str;
    }

    private String getEffectCachePath() {
        if (TXCCommonUtil.getAppContext() == null) {
            return "";
        }
        return TXCCommonUtil.getAppContext().getCacheDir() + File.separator + "liteav_effect";
    }

    public static TXCSoundEffectPlayer getInstance() {
        return C14140a.f58831a;
    }

    public void clearCache() {
        if (TXCCommonUtil.getAppContext() == null) {
            return;
        }
        try {
            File file = new File(getEffectCachePath());
            if (file.exists() && file.isDirectory() && C14212c.m84200a(file) > 52428800) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (Exception e) {
            TXCLog.m84156w(TAG, "clearCache error " + e.toString());
        }
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onComplete(int i, int i2) {
        TXCLog.m84152i(TAG, "onMusicPlayFinish -> effect id = " + i);
        WeakReference<InterfaceC14145c> weakReference = mWeakSoundEffectListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().onEffectPlayFinish(i);
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onPlayProgress(int i, long j, long j2) {
    }

    @Override // com.tencent.liteav.audio.TXAudioEffectManager.TXMusicPlayObserver
    public void onStart(int i, int i2) {
        TXCLog.m84152i(TAG, "onStart -> effect id = " + i + ", errCode = " + i2);
        WeakReference<InterfaceC14145c> weakReference = mWeakSoundEffectListener;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        mWeakSoundEffectListener.get().onEffectPlayStart(i, i2);
    }

    public void pauseEffectWithId(int i) {
        TXCLog.m84152i(TAG, "pauseEffectWithId -> effect id = " + i);
        TXAudioEffectManagerImpl.getCacheInstance().pausePlayMusic(i);
    }

    public boolean playEffectWithId(int i, String str, boolean z, int i2) {
        TXCLog.m84152i(TAG, "playEffectWithId -> effect id = " + i + ", path = " + str + ", loop = " + i2);
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i, checkIfAssetsFile(str));
        audioMusicParam.publish = z;
        audioMusicParam.loopCount = i2;
        audioMusicParam.isShortFile = true;
        boolean zStartPlayMusic = TXAudioEffectManagerImpl.getCacheInstance().startPlayMusic(audioMusicParam);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i, this);
        this.mShortEffectorIDList.add(Integer.valueOf(i));
        TXCLog.m84152i(TAG, "playEffectWithId ->effect id = " + i + ", startPlayMusic result = " + zStartPlayMusic);
        return zStartPlayMusic;
    }

    public void resumeEffectWithId(int i) {
        TXCLog.m84152i(TAG, "resumeEffectWithId -> effect id = " + i);
        TXAudioEffectManagerImpl.getCacheInstance().resumePlayMusic(i);
    }

    public void setEffectsVolume(float f) {
        TXCLog.m84152i(TAG, "setEffectsVolume -> volume = " + f);
        Iterator<Integer> it = this.mShortEffectorIDList.iterator();
        while (it.hasNext()) {
            TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(it.next().intValue(), (int) (100.0f * f));
        }
    }

    public void setSoundEffectListener(InterfaceC14145c interfaceC14145c) {
        if (interfaceC14145c == null) {
            mWeakSoundEffectListener = null;
        } else {
            mWeakSoundEffectListener = new WeakReference<>(interfaceC14145c);
        }
    }

    public void setVolumeOfEffect(int i, float f) {
        TXCLog.m84152i(TAG, "setVolumeOfEffect -> effect id = " + i + ", volume = " + f);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicVolume(i, (int) (f * 100.0f));
    }

    public void stopAllEffect() {
        TXCLog.m84152i(TAG, "stopAllEffect -> start");
        Iterator<Integer> it = this.mShortEffectorIDList.iterator();
        while (it.hasNext()) {
            TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(it.next().intValue());
        }
        this.mShortEffectorIDList.clear();
        TXCLog.m84152i(TAG, "stopAllEffect -> finish");
    }

    public void stopEffectWithId(int i) {
        TXCLog.m84152i(TAG, "stopEffectWithId -> effect id = " + i);
        TXAudioEffectManagerImpl.getCacheInstance().setMusicObserver(i, null);
        TXAudioEffectManagerImpl.getCacheInstance().stopPlayMusic(i);
        int iIndexOf = this.mShortEffectorIDList.indexOf(Integer.valueOf(i));
        if (iIndexOf >= 0) {
            this.mShortEffectorIDList.remove(iIndexOf);
        }
    }
}
