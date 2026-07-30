package com.momo.rtcbase;

/* JADX INFO: loaded from: classes8.dex */
public class BuiltinAudioDecoderFactoryFactory implements AudioDecoderFactoryFactory {
    private static native long nativeCreateBuiltinAudioDecoderFactory();

    @Override // com.momo.rtcbase.AudioDecoderFactoryFactory
    public long createNativeAudioDecoderFactory() {
        return nativeCreateBuiltinAudioDecoderFactory();
    }
}
