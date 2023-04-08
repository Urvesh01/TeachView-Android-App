package com.example.techview.cards;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class FirebaseCards {

    public static  final FirebaseFirestore firebase = FirebaseFirestore.getInstance();
    public static  final FirebaseAuth mAuth = FirebaseAuth.getInstance();


    public static final CollectionReference MAIN_CHAT_DATABASE = firebase.collection("CHAT");



}
